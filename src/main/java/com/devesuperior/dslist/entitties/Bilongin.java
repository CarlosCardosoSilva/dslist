package com.devesuperior.dslist.entitties;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_bilonging")
public class Bilongin {
	@EmbeddedId
	private BelongingPK id = new BelongingPK();

	private Integer position;
    
	
	public Bilongin() {
		
	}


	public Bilongin(Game game, GameList list, Integer position) {
		
		id.setGame(game);
		id.setList(list);
		this.position = position;
	}


	public BelongingPK getId() {
		return id;
	}


	public void setId(BelongingPK id) {
		this.id = id;
	}


	public Integer getPosition() {
		return position;
	}


	public void setPosition(Integer position) {
		this.position = position;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bilongin other = (Bilongin) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
