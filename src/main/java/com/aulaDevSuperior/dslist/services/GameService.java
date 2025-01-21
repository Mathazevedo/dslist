package com.aulaDevSuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aulaDevSuperior.dslist.dto.GameMinDTO;
import com.aulaDevSuperior.dslist.entities.Game;
import com.aulaDevSuperior.dslist.repositories.GameRepository;

@Component
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll()
	{
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
		
	}
}
