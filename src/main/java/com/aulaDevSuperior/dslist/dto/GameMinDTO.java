package com.aulaDevSuperior.dslist.dto;

import com.aulaDevSuperior.dslist.entities.Game;
import com.aulaDevSuperior.dslist.projections.GameMinProjection;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDTO {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY) 
	private Long id;
	private String title;
	@Column(name = "game_year")
	private Integer year;
	private String imgUrl;
	@Column(columnDefinition = "TEXT")
	private String shortDescription;

	public GameMinDTO() {
		
	}
	

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}


	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}


	public Long getId() {
		return id;
	}



	public String getTitle() {
		return title;
	}



	public Integer getYear() {
		return year;
	}



	public String getImgUrl() {
		return imgUrl;
	}



	public String getShortDescription() {
		return shortDescription;
	}



	
	
}
