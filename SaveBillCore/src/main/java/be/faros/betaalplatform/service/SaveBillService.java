package be.faros.betaalplatform.service;

import java.util.Collection;

import be.faros.betaalplatform.entities.PersoonEntity;
import be.faros.betaalplatform.model.Persoon;


public interface SaveBillService {
	public void savePersoon(Persoon persoon);
	public void deletePersoon(Persoon persoon);
	public Persoon findPersoonById(Long id);
	public Persoon findPersoonByEmail(String email);
	public Collection<Persoon> findAllePersonen();
}
