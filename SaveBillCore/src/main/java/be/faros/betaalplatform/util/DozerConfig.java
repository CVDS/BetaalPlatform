package be.faros.betaalplatform.util;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;

public class DozerConfig {
	private DozerBeanMapper mapper;

	public DozerConfig() {
		mapper = new DozerBeanMapper(
				Arrays.asList(new String[] { "dozerBeanMapping.xml" }));
	}

	public DozerConfig(String xmlFile) {
		mapper = new DozerBeanMapper(Arrays.asList(new String[] { xmlFile }));
	}

	public DozerBeanMapper getmapper() {
		return mapper;
	}

}
