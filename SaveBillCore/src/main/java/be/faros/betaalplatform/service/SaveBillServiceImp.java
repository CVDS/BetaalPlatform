package be.faros.betaalplatform.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.faros.betaalplatform.entities.EvenementEntity;
import be.faros.betaalplatform.entities.PersoonEntity;
import be.faros.betaalplatform.entities.RekeningEntity;
import be.faros.betaalplatform.model.Evenement;
import be.faros.betaalplatform.model.Persoon;
import be.faros.betaalplatform.model.Role;
import be.faros.betaalplatform.repository.EvenementRepository;
import be.faros.betaalplatform.repository.PersoonRepository;

@Service
public class SaveBillServiceImp implements SaveBillService {

	private PersoonRepository persoonRepository;
	private EvenementRepository evenementRepository;

	@Autowired
	public SaveBillServiceImp(PersoonRepository persoonRepository, EvenementRepository evenementRepository) {
		this.persoonRepository = persoonRepository;
		this.evenementRepository = evenementRepository;
	}

	@Override
	@Transactional
	public void savePersoon(Persoon p) {
		PersoonEntity pe = new PersoonEntity(p.getNaam(), p.getVoornaam(), p.getEmail(), p.getGeboortedatum(), p.getRole());
		persoonRepository.save(pe);
	}
	
	@Override
	@Transactional
	public void registreerPersoon(String naam, String voornaam, String email, Role role, Date geboortedatum, String wachtwoord){
		PersoonEntity pe = new PersoonEntity(naam, voornaam, email, geboortedatum, role, wachtwoord);
		persoonRepository.save(pe);
	}

	@Override
	@Transactional
	public void deletePersoon(Persoon persoon) {
		//TODO Uniek email moet afgedwongen worden
		PersoonEntity pe = persoonRepository.findByEmail(persoon.getEmail());
		persoonRepository.delete(pe);
	}

	@Override
	@Transactional
	public Persoon findPersoonById(Long id) {
		PersoonEntity pe = persoonRepository.findById(id);
		Persoon persoon = new Persoon(pe.getId(), pe.getVoornaam(), pe.getNaam(), pe.getEmail(), pe.getRole(), pe.getGeboortedatum());
		return persoon;
	}
	
	@Override
	@Transactional
	public Persoon findPersoonByEmail(String email){
		PersoonEntity pe = persoonRepository.findByEmail(email);
		Persoon persoon = new Persoon(pe.getId(), pe.getVoornaam(), pe.getNaam(), pe.getEmail(), pe.getRole(), pe.getGeboortedatum());
		return persoon;
	}

	@Override
	@Transactional
	public Collection<Persoon> findAllePersonen() {
		Collection<PersoonEntity> personenE = persoonRepository.findAll();
		Collection<Persoon> personen = new ArrayList<Persoon>();
		for(PersoonEntity pe:personenE){
			Persoon persoon = new Persoon(pe.getId(), pe.getVoornaam(), pe.getNaam(), pe.getEmail(), pe.getRole(), pe.getGeboortedatum());
			personen.add(persoon);
		}
		return personen;
	}

	@Override
	@Transactional
	public void saveEvenement(Evenement evenement) {
		RekeningEntity rekeningEntity;
		//EvenementEntity eventEntity = new EvenementEntity(evenement.getRekening(), evenement.getNaam(), evenement.getStartDatum(), evenement.getEindDatum());
		evenementRepository.save(null);
	}

	@Override
	@Transactional
	public void deleteEvenementById(Long id) {
		EvenementEntity eventEntity = evenementRepository.findById(id);
		evenementRepository.delete(eventEntity);
	}

	@Override
	@Transactional
	public Evenement findEvenementById(Long id) {
		EvenementEntity evenementEntity = evenementRepository.findById(id);
		//RekeningEntity rekeningEntity = evenementEntity.getRekening();
	//	Rekening rekening = new Rekening();
		Evenement evenement = new Evenement( evenementEntity.getNaam(), evenementEntity.getStatus(),evenementEntity.getStartDatum(), evenementEntity.getEindDatum());
		return evenement;
	}

	@Override
	@Transactional
	public Collection<Evenement> findAlleEvenementen() {
		Collection<EvenementEntity> evenementenE = evenementRepository.findAll();
		Collection<Evenement> evenementen = new ArrayList<Evenement>();
		for(EvenementEntity evenementEntity:evenementenE){
			//RekeningEntity rekeningEntity = evenementEntity.getRekening();
			//Rekening rekening = new Rekening();
			Evenement evenement = new Evenement(evenementEntity.getNaam(), evenementEntity.getStatus(),evenementEntity.getStartDatum(), evenementEntity.getEindDatum());
			evenementen.add(evenement);
		}
		return evenementen;
	}

}
