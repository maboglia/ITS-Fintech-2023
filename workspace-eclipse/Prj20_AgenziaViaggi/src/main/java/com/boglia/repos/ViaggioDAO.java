package com.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.entities.Viaggio;

public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {

}
