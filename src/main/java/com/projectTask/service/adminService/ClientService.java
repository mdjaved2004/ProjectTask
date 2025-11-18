package com.projectTask.service.adminService;


import java.util.List;

import com.projectTask.model.userModel.ClientModel;

public interface ClientService {
    boolean addClient(ClientModel client);
    boolean deleteClient(int id);
    List<ClientModel> getClients();
}
