package com.boglia;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.boglia.entities.Documento;
import com.boglia.entities.Viaggio;
import com.boglia.repos.DocumentoDAO;
import com.boglia.repos.ViaggioDAO;

@SpringBootApplication
public class Prj20AgenziaViaggiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj20AgenziaViaggiApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner testa(ViaggioDAO dao, DocumentoDAO ddao) {
//		
//		return (a) -> {
//			Documento d = new Documento();
//			d.setNomeFile("Vaccinazioni richieste per il viaggio avventura");
//			d.setPath("upload/vaccinazioni.pdf");
//			
//			Viaggio v = new Viaggio();
//			v.setNome("Cena romantica a Lisbona");
//			v.setPrezzo(200);
//			v.setGiorni(3);
//			v.setDocumento(d);
//			
//			ddao.save(d);
//			dao.save(v);
//		};
//		
//	}
	
	
}
