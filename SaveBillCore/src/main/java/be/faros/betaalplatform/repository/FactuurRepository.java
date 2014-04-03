package be.faros.betaalplatform.repository;

import java.util.Collection;

import be.faros.betaalplatform.entities.FactuurEntity;
import be.faros.betaalplatform.entities.RekeningEntity;

public interface FactuurRepository {
	public void save(FactuurEntity factuur);
	public void delete(FactuurEntity factuur);
	public FactuurEntity findById(Long id);
	public Collection<FactuurEntity> findAll();
}
