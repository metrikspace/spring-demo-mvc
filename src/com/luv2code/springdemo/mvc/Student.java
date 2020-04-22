package com.luv2code.springdemo.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.LinkedHashMap;

public class Student {
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("DE", "Germany");
		countryOptions.put("FR", "France");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");
		languageOptions = new ArrayList<String>();
		languageOptions.add("C");
		languageOptions.add("C#");
		languageOptions.add("C++");
		languageOptions.add("Java");
		languageOptions.add("Ruby");
		osOptions = new ArrayList<String>();
		osOptions.add("Linux");
		osOptions.add("Mac OS");
		osOptions.add("MS Windows");
	}
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	private String country;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	private LinkedHashMap<String, String> countryOptions;
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	private String language;
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}	

	private List<String> languageOptions;
	public List<String> getLanguageOptions() {
		return languageOptions;
	}
	public void setLanguageOptions(List<String> languageOptions) {
		this.languageOptions = languageOptions;
	}
	
	private String os;
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}

	private List<String> osOptions;
	public List<String> getOsOptions() {
		return osOptions;
	}
	public void setOsOptions(List<String> osOptions) {
		this.osOptions = osOptions;
	}
}