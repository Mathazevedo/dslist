package com.aulaDevSuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaDevSuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
