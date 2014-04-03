package be.faros.betaalplatform.repository.hibernate;

import java.util.Collection;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import be.faros.betaalplatform.entities.RekeningEntity;
import be.faros.betaalplatform.repository.RekeningRepository;

@Repository("rekeningRepository")
public class HibernateRekeningRepository implements RekeningRepository {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(RekeningEntity rekening) {
		sessionFactory.getCurrentSession().save(rekening);
	}

	@Override
	public void delete(RekeningEntity rekening) {
		sessionFactory.getCurrentSession().delete(rekening);
	}

	@Override
	public RekeningEntity findById(Long id) {
		RekeningEntity rekening = (RekeningEntity) sessionFactory.getCurrentSession().get(RekeningEntity.class, id);
		return rekening;
	}

	@Override
	public Collection<RekeningEntity> findAll() {
		Query query = sessionFactory.getCurrentSession().createQuery("from RekeningEntity");
		Collection<RekeningEntity> rekeningen = query.list();
		return rekeningen;
	}
}
