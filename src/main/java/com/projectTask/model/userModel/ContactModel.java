package com.projectTask.model.userModel;

public class ContactModel {
	private String id;
    private String fullName;
    private String email;
    private String mobile;
    private String city;
	
    public ContactModel(String id, String fullName, String email, String mobile, String city) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
	}

	public ContactModel(String fullName, String email, String mobile, String city) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
    
	

   
}
