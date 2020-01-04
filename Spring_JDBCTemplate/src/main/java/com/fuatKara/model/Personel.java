package com.fuatKara.model;

public class Personel {
	private int idemployee;
	private String name;
	private String surname;
	private int experience;

	public Personel() {
	}

	public Personel(String name, String surname, int experience) {
		super();
		this.name = name;
		this.surname = surname;
		this.experience = experience;
	}

	public Personel(int idemployee, String name, String surname, int experience) {
		super();
		this.idemployee = idemployee;
		this.name = name;
		this.surname = surname;
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Personel [idemployee=" + idemployee + ", name=" + name + ", surname=" + surname + ", experience="
				+ experience + "]";
	}

	public int getIdemployee() {
		return idemployee;
	}

	public void setIdemployee(int idemployee) {
		this.idemployee = idemployee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}