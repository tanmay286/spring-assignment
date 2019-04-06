package com.capgemini.spring.organization;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;


public class AddressConfig {
	
	
	private String doorNumber;

	
	private String street;

	private String cityName;

	
	private String state;


	public AddressConfig() {
		super();
	}
	public AddressConfig(String doorNumber, String street, String cityName, String state ) {
		super();
		this.doorNumber = doorNumber;
		this.street = street;
		this.cityName = cityName;
		this.state = state;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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
		return "doorNumber=" + doorNumber + ", Street=" + street + ", CityName=" + cityName + ", State=" + state;
	}
	

}
