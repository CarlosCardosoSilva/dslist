package com.devesuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.entitties.Game;
import com.devesuperior.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		//return result.stream().map(x -> new GameMinDTO(x)).toList();
		
		return dto;
				
	}
 
	
}
