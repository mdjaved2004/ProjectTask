package com.projectTask.validation;

import com.projectTask.model.userModel.ContactModel;

public class ContactValidator {
    public static String validate(ContactModel contact) {
        if(contact.getFullName() == null || contact.getFullName().trim().isEmpty()) 
            return "Full Name is required!";
        if(contact.getEmail() == null || contact.getEmail().trim().isEmpty()) 
            return "Email is required!";
        if(contact.getMobile() == null || !contact.getMobile().matches("\\d{10}")) 
            return "Enter valid 10-digit mobile number!";
        if(contact.getCity() == null || contact.getCity().trim().isEmpty()) 
            return "City is required!";
        return null;
    }
}
