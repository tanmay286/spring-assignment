package com.capgemini.spring.organization;

public class Address {
	
	private int doorNumber;
	private String Street;
	private String cityName;
	private String state;

	public Address() {
		super();
	}
	public Address(int doorNumber, String street, String cityName, String state) {
		super();
		this.doorNumber = doorNumber;
		this.Street = street;
		this.cityName = cityName;
		this.state = state;
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		this.Street = street;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", Street=" + Street + ", cityName=" + cityName + ", state="
				+ state + "]";
	}
	

}
