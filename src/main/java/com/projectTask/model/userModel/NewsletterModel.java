package com.projectTask.model.userModel;

public class NewsletterModel {

    private int id;
    private String email;

   

    public NewsletterModel(String email) {
        this.email = email;
    }
    
    

    public NewsletterModel(int id, String email) {
		super();
		this.id = id;
		this.email = email;
	}



	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
