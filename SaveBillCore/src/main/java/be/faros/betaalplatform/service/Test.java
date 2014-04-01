package be.faros.betaalplatform.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.faros.betaalplatform.model.PersoonEntity;
import be.faros.betaalplatform.util.ApplicationConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		SaveBillService service = (SaveBillService) ctx.getBean("saveBillServiceImp");	
		
		PersoonEntity persoon = new PersoonEntity("Jos", "Joskens", "Joske@mail.be", "deelnemer", "azerty123");
		/* 
		service.savePersoon(persoon);
		*/
		/*
		service.deletePersoon(persoon);
		 */
		
		PersoonEntity pg = service.findPersoonById(new Long(4));
		System.out.println(pg.getVoornaam() + " " + pg.getNaam());
		
		/*
		for(PersoonEntity p:service.findAllePersonen()){
			System.out.println(p.getVoornaam() + " " + p.getNaam());
		}
		*/
	}

}