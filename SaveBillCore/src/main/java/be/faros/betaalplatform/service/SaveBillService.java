package be.faros.betaalplatform.service;

import java.util.Collection;
import java.util.Date;

import be.faros.betaalplatform.model.Evenement;
import be.faros.betaalplatform.model.Persoon;
import be.faros.betaalplatform.model.Role;


public interface SaveBillService {
	//PersoonService
	public void savePersoon(Persoon persoon);
	public void registreerPersoon(String naam, String voornaam, String email, Role role, Date geboortedatum, String wachtwoord);
	public void deletePersoon(Persoon persoon);
	public Persoon findPersoonById(Long id);
	public Persoon findPersoonByEmail(String email);
	public Collection<Persoon> findAllePersonen();
	
	//EvenementService
	public void saveEvenement(Evenement evenement);
	public void deleteEvenementById(Long id);
	public Evenement findEvenementById(Long id);
	public Collection<Evenement> findAlleEvenementen();
	
}
