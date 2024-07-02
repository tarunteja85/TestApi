package com.restapi.demoApi.entity;

public class Address {
	
	private Long id;	
	
	private String street;
	
	private String suite;
	
	private String city;
	
	private String zipcode;
	
	private Geo geo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getSuite() {
		return suite;
	}
	public void setSuite(String suite) {
		this.suite = suite;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Geo getGeo() {
		return geo;
	}
	public void setGeo(Geo geo) {
		this.geo = geo;
	}
	
	
	public Address(Long id, String street, String suite, String city, String zipcode, Geo geo) {
		super();
		this.id = id;
		this.street = street;
		this.suite = suite;
		this.city = city;
		this.zipcode = zipcode;
		this.geo = geo;
	}
	
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", suite=" + suite + ", city=" + city + ", zipcode="
				+ zipcode + ", geo=" + geo + "]";
	}
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
}
