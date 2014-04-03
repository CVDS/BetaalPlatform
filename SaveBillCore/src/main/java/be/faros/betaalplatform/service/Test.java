package be.faros.betaalplatform.service;

import java.util.Arrays;
import java.util.Date;

import org.dozer.DozerBeanMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.faros.betaalplatform.entities.EvenementEntity;
import be.faros.betaalplatform.entities.PersoonEntity;
import be.faros.betaalplatform.model.Evenement;
import be.faros.betaalplatform.model.Factuur;
import be.faros.betaalplatform.model.Persoon;
import be.faros.betaalplatform.model.Rekening;
import be.faros.betaalplatform.util.ApplicationConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				ApplicationConfig.class);
		SaveBillService service = (SaveBillService) ctx
				.getBean("saveBillServiceImp");

		/*
		 * service.savePersoon(persoon);
		 */
		/*
		 * service.deletePersoon(persoon);
		 */
		/*
		 * Persoon p = service.findPersoonById(new Long(4));
		 * System.out.println(p.getId() + ": " + p.getVoornaam() + " " +
		 * p.getNaam() + " - " + p.getEmail() + " - " + p.getGeboortedatum());
		 * // System.out.println(p.getAlleRekeningen());
		 * 
		 * Persoon p2 = service.findPersoonByEmail("kevin@gmail.com");
		 * System.out.println(p2.getId() + ": " + p2.getVoornaam() + " " +
		 * p2.getNaam() + " - " + p2.getEmail() + " - " +
		 * p2.getGeboortedatum());
		 */
		/* 
		 * 
		 */

		System.out.println("--------PERSONEN---------");
		for (Persoon ps : service.findAllePersonen()) {
			System.out.println(ps.getId() + ": " + ps.getVoornaam() + " "
					+ ps.getNaam());
		}

		System.out.println("\n--------EVENEMENTEN---------");
		for (Evenement es : service.findAlleEvenementen()) {
			System.out.println(es.getId() + ": " + es.getNaam() + " "
					+ es.getState());
		}

		System.out.println("\n--------REKENINGEN---------");
		for (Rekening rs : service.findAlleRekeningen()) {
			System.out.println(rs.getId() + ": " + rs.getRekeningnummer() + " "
					+ rs.getBank());
		}

		System.out.println("\n--------FACTUREN---------");
		for (Factuur fs : service.findAlleFacturen()) {
			System.out.println(fs.getId() + ": " + fs.getBedrag() + " "
					+ fs.getDatum());
		}

		/*
		 * DozerBeanMapper mapper = new DozerBeanMapper( Arrays.asList(new
		 * String[] { "dozerBeanMapping.xml" }));
		 * 
		 * Persoon persoon = new Persoon(); persoon.setNaam("jos");
		 * 
		 * PersoonEntity persoonE = mapper.map(persoon, PersoonEntity.class);
		 * System.out.println(persoon.getNaam());
		 */

	}

}
