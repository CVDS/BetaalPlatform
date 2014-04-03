package be.faros.betaalplatform.util;

import org.dozer.classmap.RelationshipType;
import org.dozer.loader.api.BeanMappingBuilder;
import org.springframework.config.java.annotation.Bean;

public class DozerConfig {
	/*
	public void map() {
		
		BeanMappingBuilder builder = new BeanMappingBuilder() {
			protected void configure() {
				mapping(Bean.class, Bean.class, oneWay(), mapId("A"),
						mapNull(true))
						.exclude("excluded")
						.fields("src",
								"dest",
								copyByReference(),
								collectionStrategy(true,
										RelationshipType.NON_CUMULATIVE),
								hintA(String.class), hintB(Integer.class),
								fieldOneWay(), useMapId("A"),
								customConverterId("id"))
						.fields("src", "dest",
								customConverter("org.dozer.CustomConverter"));
			}
		};
	}
	*/
}
