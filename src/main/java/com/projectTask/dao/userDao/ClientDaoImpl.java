package com.projectTask.dao.userDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.projectTask.dao.connections.ConnectionFactoryImpl;
import com.projectTask.model.userModel.ClientModel;

public class ClientDaoImpl implements ClientDao {

    @Override
    public List<ClientModel> getAllClients() {
        List<ClientModel> clients = new ArrayList<>();
        String sql = "SELECT * FROM clients";

        try (Connection con = new ConnectionFactoryImpl().getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                ClientModel client = new ClientModel(
                        rs.getInt("id"),
                        rs.getString("client_name"),
                        rs.getString("designation"),
                        rs.getString("description"),
                        rs.getString("image")
                );
                clients.add(client);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return clients;
    }
}
