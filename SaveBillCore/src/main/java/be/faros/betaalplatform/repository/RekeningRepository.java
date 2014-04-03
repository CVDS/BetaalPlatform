package be.faros.betaalplatform.repository;

import java.util.Collection;

import be.faros.betaalplatform.entities.RekeningEntity;

public interface RekeningRepository {
	public void save(RekeningEntity rekening);
	public void delete(RekeningEntity rekening);
	public RekeningEntity findById(Long id);
	public Collection<RekeningEntity> findAll();
}
