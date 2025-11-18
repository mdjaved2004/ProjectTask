package com.projectTask.service.adminService;

import java.util.List;

import com.projectTask.dao.adminDao.ClientDao;
import com.projectTask.dao.adminDao.ClientDaoImpl;
import com.projectTask.model.userModel.ClientModel;

public class ClientServiceImpl implements ClientService {
    private ClientDao dao = new ClientDaoImpl();

    @Override
    public boolean addClient(ClientModel client) { return dao.addClient(client); }

    @Override
    public boolean deleteClient(int id) { return dao.deleteClient(id); }

    @Override
    public List<ClientModel> getClients() { return dao.getAllClients(); }
}
