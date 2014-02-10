package com.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="countries")
public class Countries 
{
	@Id
	@Column(name="codeCountry")
	private String code;
	@Column(name="nameCountry")
	private String name;
	@Column(name="continentCountry")
	private String continent;
	@Column(name="populationCountry")
	private int population;
	@Column(name="capitalCountry")
	private String capital;
	
	
	public Countries() {
		// TODO Auto-generated constructor stub
	}
	
	public Countries(String cod, String nam, String cnt, int pop, String cap)
	{
		this.code = cod;
		this.name = nam;
		this.continent = cnt;
		this.population = pop;
		this.capital = cap;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	
	
}
