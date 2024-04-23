/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dnd.model;

/**
 *
 * @author LuqmaanS
 */
public class FullName {

	private String surname;
	private String givenNames;

	public FullName(String surname, String givenNames) {
		this.surname = surname;
		this.givenNames = givenNames;
	}

	public FullName(String[] name) {
		String givenName = name[0] + (name.length > 2 ? " " + name[1] : "") + (name.length > 3 ? " " + name[2] : "");
		this.surname = name[name.length - 1];
		this.givenNames = givenName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGivenNames() {
		return givenNames;
	}

	public void setGivenNames(String givenNames) {
		this.givenNames = givenNames;
	}

	@Override
	public String toString() {
		return givenNames + " " + surname;
	}

}