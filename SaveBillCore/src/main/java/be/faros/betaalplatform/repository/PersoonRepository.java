package be.faros.betaalplatform.repository;

import java.util.Collection;

import be.faros.betaalplatform.model.PersoonEntity;

public interface PersoonRepository {

	public void save(PersoonEntity persoon);
	public void delete(PersoonEntity persoon);
	public PersoonEntity findById(Long id);
	public Collection<PersoonEntity> findAll();
}
