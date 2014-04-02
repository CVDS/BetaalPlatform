package be.faros.betaalplatform.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.faros.betaalplatform.entities.PersoonEntity;
import be.faros.betaalplatform.model.Persoon;
import be.faros.betaalplatform.model.Role;
import be.faros.betaalplatform.repository.PersoonRepository;

@Service
public class SaveBillServiceImp implements SaveBillService {

	private PersoonRepository persoonRepository;

	@Autowired
	public SaveBillServiceImp(PersoonRepository persoonRepository) {
		this.persoonRepository = persoonRepository;
	}

	@Transactional
	public void savePersoon(Persoon p) {
		PersoonEntity pe = new PersoonEntity(p.getNaam(), p.getVoornaam(), p.getEmail(), p.getGeboortedatum(), p.getRole());
		persoonRepository.save(pe);
	}
	
	@Transactional
	public void registreerPersoon(String naam, String voornaam, String email, Role role, Date geboortedatum, String wachtwoord){
		PersoonEntity pe = new PersoonEntity(naam, voornaam, email, geboortedatum, role, wachtwoord);
		persoonRepository.save(pe);
	}

	@Transactional
	public void deletePersoon(Persoon persoon) {
		//TODO Uniek email moet afgedwongen worden
		PersoonEntity pe = persoonRepository.findByEmail(persoon.getEmail());
		persoonRepository.delete(pe);
	}

	@Transactional
	public Persoon findPersoonById(Long id) {
		PersoonEntity pe = persoonRepository.findById(id);
		Persoon persoon = new Persoon(pe.getVoornaam(), pe.getNaam(), pe.getEmail(), pe.getRole(), pe.getGeboortedatum());
		return persoon;
	}
	
	@Transactional
	public Persoon findPersoonByEmail(String email){
		PersoonEntity pe = persoonRepository.findByEmail(email);
		Persoon persoon = new Persoon(pe.getVoornaam(), pe.getNaam(), pe.getEmail(), pe.getRole(), pe.getGeboortedatum());
		return persoon;
	}

	@Transactional
	public Collection<Persoon> findAllePersonen() {
		Collection<PersoonEntity> personenE = persoonRepository.findAll();
		Collection<Persoon> personen = new ArrayList<Persoon>();
		for(PersoonEntity pe:personenE){
			Persoon persoon = new Persoon(pe.getVoornaam(), pe.getNaam(), pe.getEmail(), pe.getRole(), pe.getGeboortedatum());
			personen.add(persoon);
		}
		return personen;
	}

}
