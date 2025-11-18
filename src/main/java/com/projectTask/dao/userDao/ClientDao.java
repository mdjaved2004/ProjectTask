package com.projectTask.dao.userDao;

import java.util.List;

import com.projectTask.model.userModel.ClientModel;

public interface ClientDao {
    List<ClientModel> getAllClients();
}
