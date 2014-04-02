package be.faros.betaalplatform.repository.hibernate;

import java.util.Collection;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import be.faros.betaalplatform.entities.EvenementEntity;
import be.faros.betaalplatform.repository.EvenementRepository;

@Repository("evenementRepository")
public class HibernateEvenementRepository implements EvenementRepository{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(EvenementEntity evenement) {
		sessionFactory.getCurrentSession().save(evenement);		
	}

	@Override
	public void delete(EvenementEntity evenement) {
		sessionFactory.getCurrentSession().delete(evenement);
	}

	@Override
	public EvenementEntity findById(Long id) {
		EvenementEntity evenement = (EvenementEntity) sessionFactory.getCurrentSession().get(EvenementEntity.class, id);
		return evenement;
	}

	@Override
	public Collection<EvenementEntity> findAll() {
		Query query = sessionFactory.getCurrentSession().createQuery("from EvenementEntity");
		Collection<EvenementEntity> evenementen = query.list();
		return evenementen;
	}

}
