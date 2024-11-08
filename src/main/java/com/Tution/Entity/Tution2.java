package com.Tution.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tution_2")
public class Tution2 {
	
	@Id
	@Column(name="rollno")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollNo;
	
	@Column(name="adress")
	private String adress;
	
	@Column(name="city")
	private String city;
	
	@Column(name="id")
	private int id;

	
	//getters and setters
	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
