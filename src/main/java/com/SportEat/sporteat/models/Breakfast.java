package com.SportEat.sporteat.models;

import jakarta.persistence.*;

@Entity
@Table(name = "breakfast")
public class Breakfast {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name, anons, full_text;

	public Breakfast() {
	}

	public Breakfast(String name, String anons, String full_text) {
		this.name = name;
		this.anons = anons;
		this.full_text = full_text;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnons() {
		return anons;
	}

	public void setAnons(String anons) {
		this.anons = anons;
	}

	public String getFull_text() {
		return full_text;
	}

	public void setFull_text(String full_text) {
		this.full_text = full_text;
	}

}
