package com.projectTask.service.adminService;


import java.util.List;

import com.projectTask.dao.adminDao.ContactDao;
import com.projectTask.dao.adminDao.ContactDaoImpl;
import com.projectTask.model.adminModel.ContactModel;

public class ContactServiceImpl implements ContactService {
    private ContactDao dao = new ContactDaoImpl();

    @Override
    public List<ContactModel> getAllContacts() {
        return dao.getAllContacts();
    }
}
