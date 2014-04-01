package be.faros.betaalplatform.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.faros.betaalplatform.model.PersoonEntity;
import be.faros.betaalplatform.repository.PersoonRepository;

@Service
public class SaveBillServiceImp implements SaveBillService {

	private PersoonRepository persoonRepository;

	@Autowired
	public SaveBillServiceImp(PersoonRepository persoonRepository) {
		this.persoonRepository = persoonRepository;
	}

	@Transactional
	public void savePersoon(PersoonEntity persoon) {
		persoonRepository.save(persoon);
	}

	@Transactional
	public void deletePersoon(PersoonEntity persoon) {
		persoonRepository.delete(persoon);
	}

	@Transactional
	public PersoonEntity findPersoonById(Long id) {
		return persoonRepository.findById(id);
	}

	@Transactional
	public Collection<PersoonEntity> findAllePersonen() {
		return persoonRepository.findAll();
	}

}