package com.Tution.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tution_1")
public class Tution1 {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="study")
	private int study;

	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudy() {
		return study;
	}

	public void setStudy(int study) {
		this.study = study;
	}
	
	//to String methods
	@Override
	public String toString() {
		return "Tution1 [id=" + id + ", name=" + name + ", age=" + age + ", study=" + study + "]";
	}
	
}
