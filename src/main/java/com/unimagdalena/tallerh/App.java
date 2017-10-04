package com.unimagdalena.tallerh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.unimagdalena.tallerh.configurtion.AppConfig;
import com.unimagdalena.tallerh.entity.Pais;
import com.unimagdalena.tallerh.service.inter.PaisService;

public class App {
	
	private static AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(AppConfig.class);

	@Autowired @Qualifier("paisService")
	public static PaisService paisService = context.getBean(PaisService.class);
	
	public static void main(String[] args) {
		initSpring();

		Pais p = new Pais("Colombia");
		paisService.save(p);
	}
	
	private static void initSpring() {
		context.start();
		context.registerShutdownHook();
	}
}
