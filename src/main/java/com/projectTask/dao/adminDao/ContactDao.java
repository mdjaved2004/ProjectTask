package com.projectTask.dao.adminDao;


import java.util.List;

import com.projectTask.model.adminModel.ContactModel;

public interface ContactDao {
    List<ContactModel> getAllContacts();
}
