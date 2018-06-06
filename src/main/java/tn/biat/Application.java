package tn.biat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import tn.biat.service.ICompteService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		ICompteService cptS = ctx.getBean(ICompteService.class);
		
		cptS.findAll().stream().forEach(System.out::println);
	}
}
