package com.devesuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devesuperior.dslist.dto.GameListDTO;
import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.dto.ReplacementDTO;
import com.devesuperior.dslist.services.GameListService;
import com.devesuperior.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	@Autowired
	private GameListService gameListService;
	@Autowired
	private GameService gameService;
	
	

	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
		
	}
	
	@GetMapping(value = "/{listsId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listsId){
		List<GameMinDTO> result = gameService.findByList(listsId);
		return result;
		
	}

	@PostMapping(value = "/{listsId}/replacement")
	public void move(@PathVariable Long listsId, @RequestBody ReplacementDTO body){
		gameListService.mov(listsId, body.getSourceIndex(), body.getDestinationIndexd());
		
	}
}
