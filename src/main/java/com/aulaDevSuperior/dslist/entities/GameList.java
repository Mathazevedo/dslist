package com.aulaDevSuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game_list")
public class GameList {
	
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY) 
private Long id;
private String Name;

public GameList() {}

public GameList(Long id, String name) {
	id = id;
	Name = name;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
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
	GameList other = (GameList) obj;
	return Objects.equals(id, other.id);
}


}
