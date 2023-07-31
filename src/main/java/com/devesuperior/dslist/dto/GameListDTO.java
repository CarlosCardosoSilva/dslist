package com.devesuperior.dslist.dto;

import com.devesuperior.dslist.entitties.GameList;

public class GameListDTO {
	private Long id;
	private String name;
	
	public GameListDTO() {
		
	}

	public GameListDTO(GameList Entity) {
		
		id = Entity.getId();	
		name = Entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	

}
