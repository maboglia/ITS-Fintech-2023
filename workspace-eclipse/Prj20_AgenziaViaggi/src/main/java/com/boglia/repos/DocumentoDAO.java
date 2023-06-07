package com.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.entities.Documento;

public interface DocumentoDAO extends JpaRepository<Documento, Integer> {

}
