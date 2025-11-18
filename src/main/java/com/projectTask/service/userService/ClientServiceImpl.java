package com.projectTask.service.userService;

import java.util.List;

import com.projectTask.dao.userDao.ClientDao;
import com.projectTask.dao.userDao.ClientDaoImpl;
import com.projectTask.model.userModel.ClientModel;

public class ClientServiceImpl implements ClientService {


    @Override
    public List<ClientModel> getAllClients() {
    		ClientDao clientDao = new ClientDaoImpl();
        return clientDao.getAllClients();
    }
}
