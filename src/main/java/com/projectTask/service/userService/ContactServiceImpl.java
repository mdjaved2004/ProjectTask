package com.projectTask.service.userService;

import com.projectTask.dao.userDao.ContactDao;
import com.projectTask.dao.userDao.ContactDaoImpl;
import com.projectTask.model.userModel.ContactModel;
import com.projectTask.validation.ContactValidator;

public class ContactServiceImpl implements ContactService {

    @Override
    public String submitContact(ContactModel contact) {
        String validationMsg = ContactValidator.validate(contact);
        if(validationMsg != null) {
            return validationMsg; // Validation failed
        }
        ContactDao dao = new ContactDaoImpl();
        boolean success = dao.saveContact(contact);
        return success ? "Contact submitted successfully!" : "Failed to submit contact!";
    }
}
