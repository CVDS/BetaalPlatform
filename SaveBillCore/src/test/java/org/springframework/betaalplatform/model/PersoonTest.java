package org.springframework.betaalplatform.model;

import static org.junit.Assert.*;

import java.util.Date;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.faros.betaalplatform.entities.PersoonEntity;
import be.faros.betaalplatform.model.Role;
import be.faros.betaalplatform.service.SaveBillService;
import be.faros.betaalplatform.util.ApplicationConfig;

public class PersoonTest {

	private ApplicationContext ctx;
	private SaveBillService service;

	@Before
	public void setUp() throws Exception {
		ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		service = (SaveBillService) ctx.getBean("saveBillServiceImp");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_valid_constructor_persoon() {
	//	PersoonEntity persoon = new PersoonEntity("Ben", "Driessens","BoDrie@mail.com",Role.ADMINISTRATOR,"psw", new Date());
	}

	@Test
	public void test_save_persoon() {
		//PersoonEntity persoon = new PersoonEntity("Jos", "Joskens", "Joske@mail.be", "deelnemer", "azerty123");
		//service.save(persoon);
		//fail("");
	}

}
