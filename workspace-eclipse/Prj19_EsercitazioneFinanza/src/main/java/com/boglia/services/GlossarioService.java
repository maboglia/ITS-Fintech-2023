package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.entities.Glossario;
import com.boglia.entities.StandarPoors;
import com.boglia.repos.GlossarioDAO;
import com.boglia.repos.StatndardDAO;

@Service
public class GlossarioService {

	@Autowired
	private GlossarioDAO dao;
	
	@Autowired
	private StatndardDAO daoStand;
	
	public List<StandarPoors> getStandarPoors(){
		return daoStand.findAll();
	}
	
	public List<StandarPoors> getStandarPoorsBySector(String sector){
		return daoStand.findByGICSSector(sector);
	}
	
	
	public List<Glossario> getAll(){
		return dao.findAll();
	}
	
	public List<String> getVoci(){
		return dao
				.findAll()
				.stream()
				.map(g -> g.getVoce())
				.toList();
	}
	
	public Glossario getByVoce(String voce) {
		return dao
				.findAll()
				.stream()
				.filter(g -> g.getVoce().equals(voce))
				.toList()
				.get(0);
	}

	public Glossario addNuovaVoce(Glossario g) {
		return dao.save(g);
		
	}
}
