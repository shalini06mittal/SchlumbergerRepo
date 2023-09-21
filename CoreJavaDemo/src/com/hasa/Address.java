package com.hasa;

public class Address {

	private String city;
	private String country;
	private String zipcode;
	private String streetname;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String country, String zipcode, String streetname) {
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
		this.streetname = streetname;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", zipcode=" + zipcode + ", streetname=" + streetname
				+ "]";
	}
	
}
