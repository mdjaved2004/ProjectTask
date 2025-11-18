package com.projectTask.dao.userDao;

import com.projectTask.model.userModel.ContactModel;

public interface ContactDao {
    boolean saveContact(ContactModel contact);
}
