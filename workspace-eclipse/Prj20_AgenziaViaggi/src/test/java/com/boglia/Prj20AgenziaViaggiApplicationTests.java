package com.boglia;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.boglia.entities.Documento;
import com.boglia.entities.Viaggio;
import com.boglia.repos.DocumentoDAO;
import com.boglia.repos.ViaggioDAO;

@SpringBootTest
class Prj20AgenziaViaggiApplicationTests {

	@Autowired
	private DocumentoDAO ddao;
	
	@Autowired
	private ViaggioDAO vdao;
	
	
	@Test
	void caricaViaggi() {
		Viaggio v = new Viaggio(); 
		Documento d = new Documento();
		
		d.setNomeFile("brochure parigi");
		d.setPath("out/parigi.pdf");
		ddao.save(d);
		
		v.setNome("Una settimana a Parigi");
		v.setGiorni(7);
		v.setPrezzo(800);
		v.setDocumento(d);
		
		vdao.save(v);
		
	}
	
	@Test
	void listaViaggi() {
		for (Viaggio v : vdao.findAll()) {
			System.out.println(v);
		}
	}
	

}
