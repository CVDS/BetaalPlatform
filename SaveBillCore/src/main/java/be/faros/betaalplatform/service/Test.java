package be.faros.betaalplatform.service;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.faros.betaalplatform.model.Evenement;
import be.faros.betaalplatform.model.Persoon;
import be.faros.betaalplatform.model.Status;
import be.faros.betaalplatform.util.ApplicationConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		SaveBillService service = (SaveBillService) ctx.getBean("saveBillServiceImp");	
		
		/* 
		service.savePersoon(persoon);
		*/
		/*
		service.deletePersoon(persoon);
		 */
		
		/*
		Persoon p = service.findPersoonById(new Long(4));
		System.out.println("By id(4): "+p.getVoornaam() + " " + p.getNaam());
		
		Persoon p2 = service.findPersoonByEmail("keving@gmail.com");
		System.out.println("By email: " + p2.getVoornaam() + " " + p2.getNaam());
		
		int i = 1;
		for(Persoon ps:service.findAllePersonen()){
			System.out.println(i + ": " + ps.getVoornaam() + " " + ps.getNaam());
			i++;
		}
		*/
		
		//Evenement ev = new Evenement(new Long(0),"nieuw event", new Date(), new Date());
		//service.saveEvenement(ev);
		/*
		Evenement e = service.findEvenementById(new Long(4));
		System.out.println("naam: " + e.getNaam() + "\tStatus: " + e.getState());
		
		int i = 1;
		for(Evenement es:service.findAlleEvenementen()){
			System.out.println(i + ": " + es.getNaam() + " " + es.getState());
			i++;
		}
		*/
		
		
	}

}
