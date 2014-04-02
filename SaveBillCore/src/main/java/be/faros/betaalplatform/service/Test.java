package be.faros.betaalplatform.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.faros.betaalplatform.model.Persoon;
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
		
		Persoon p = service.findPersoonById(new Long(4));
		System.out.println("By id(4): "+p.getVoornaam() + " " + p.getNaam());
		
		Persoon p2 = service.findPersoonByEmail("keving@gmail.com");
		System.out.println("By email: " + p2.getVoornaam() + " " + p2.getNaam());
		
		/*
		for(PersoonEntity p:service.findAllePersonen()){
			System.out.println(p.getVoornaam() + " " + p.getNaam());
		}
		*/
	}

}
