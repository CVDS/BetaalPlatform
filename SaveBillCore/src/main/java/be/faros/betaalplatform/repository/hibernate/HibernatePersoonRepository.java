package be.faros.betaalplatform.repository.hibernate;

import java.util.Collection;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import be.faros.betaalplatform.model.PersoonEntity;
import be.faros.betaalplatform.repository.PersoonRepository;

@Repository("persoonRepository")
public class HibernatePersoonRepository implements PersoonRepository{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(PersoonEntity persoon) {
		sessionFactory.getCurrentSession().save(persoon);	
	}

	public void delete(PersoonEntity persoon) {
		sessionFactory.getCurrentSession().delete(persoon);
	}
	
	public PersoonEntity findById(Long id){
		PersoonEntity persoon = (PersoonEntity) sessionFactory.getCurrentSession().get(PersoonEntity.class, id);
		return persoon;
	}

	public Collection<PersoonEntity> findAll() {
		Query query = sessionFactory.getCurrentSession().createQuery("from PersoonEntity");
		Collection<PersoonEntity> personenLijst = query.list();
		return personenLijst;
	}


}
