package com.aulaDevSuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaDevSuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
