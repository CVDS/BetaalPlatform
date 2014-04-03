package be.faros.betaalplatform.repository.hibernate;

import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import be.faros.betaalplatform.entities.PersoonEntity;
import be.faros.betaalplatform.repository.PersoonRepository;

@Repository("persoonRepository")
public class HibernatePersoonRepository implements PersoonRepository{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(PersoonEntity persoon) {
		sessionFactory.getCurrentSession().save(persoon);	
	}

	@Override
	public void delete(PersoonEntity persoon) {
		sessionFactory.getCurrentSession().delete(persoon);
	}
	
	@Override
	public PersoonEntity findById(Long id){
		PersoonEntity persoon = (PersoonEntity) sessionFactory.getCurrentSession().get(PersoonEntity.class, id);
		return persoon;
	}
	
	@Override
	public PersoonEntity findByEmail(String email){
		//TODO Mail niet hardcoded
		Query query = sessionFactory.getCurrentSession().createQuery("from PersoonEntity where email= :email ");
		query.setParameter("email", email);
		List<PersoonEntity> personen = query.list();
		if(personen.isEmpty()){
			//throw exception: person not found
		}
		PersoonEntity persoon = personen.get(0);
		return persoon;
	}

	@Override
	public Collection<PersoonEntity> findAll() {
		Query query = sessionFactory.getCurrentSession().createQuery("from PersoonEntity");
		Collection<PersoonEntity> personenLijst = query.list();
		return personenLijst;
	}

}
