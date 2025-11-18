package com.projectTask.validation;

public class NewsletterValidation {
	
    public boolean validationEmail(String email) {
        if(email == null || email.trim().isEmpty()) {
            return false;
        }

        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }
}
