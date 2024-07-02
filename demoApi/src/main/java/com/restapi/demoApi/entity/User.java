package com.restapi.demoApi.entity;

public class User {
	
	private Long id;
	
	private String name;
	
	private String username;
	
	private String email;
	
	private String phone;
	
	private Address address;
	
	private Company company;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", company=" + company + "]";
	}

	public User(Long id, String name, String username, String email, String phone, Address address, Company company) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.company = company;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
}
