package com.unimagdalena.tallerh.configurtion;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(HibernateConfig.class)
@ComponentScan(basePackages = {"com.unimagdalena.tallerh"})
public class AppConfig {
	
	private static final Logger LOGGER = Logger.getLogger(AppConfig.class);
	
	@PostConstruct
	public void init() {
		LOGGER.info("Inicio contexto Spring");
	}
	
	@PreDestroy
	public void destroy() {
		LOGGER.info("Fin contexto Spring");
	}
}
