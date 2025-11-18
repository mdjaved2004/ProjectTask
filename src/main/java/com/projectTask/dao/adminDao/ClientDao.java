package com.projectTask.dao.adminDao;

import java.util.List;

import com.projectTask.model.userModel.ClientModel;

public interface ClientDao {
    boolean addClient(ClientModel client);
    boolean deleteClient(int id);
    List<ClientModel> getAllClients();
}
