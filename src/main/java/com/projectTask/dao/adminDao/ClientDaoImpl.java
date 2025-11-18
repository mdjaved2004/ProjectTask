package com.projectTask.dao.adminDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.projectTask.dao.connections.ConnectionFactoryImpl;
import com.projectTask.model.userModel.ClientModel;

public class ClientDaoImpl implements ClientDao {

    @Override
    public boolean addClient(ClientModel client) {
        String sql = "INSERT INTO clients (client_name, designation, description, image) VALUES (?,?,?,?)";
        try (Connection con = new ConnectionFactoryImpl().getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, client.getClientName());
            ps.setString(2, client.getDesignation());
            ps.setString(3, client.getDescription());
            ps.setString(4, client.getImage());
            return ps.executeUpdate() > 0;
        } catch(Exception e) { e.printStackTrace(); }
        return false;
    }

    @Override
    public boolean deleteClient(int id) {
        String sql = "DELETE FROM clients WHERE id=?";
        try (Connection con = new ConnectionFactoryImpl().getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch(Exception e) { e.printStackTrace(); }
        return false;
    }

    @Override
    public List<ClientModel> getAllClients() {
        List<ClientModel> list = new ArrayList<>();
        String sql = "SELECT * FROM clients";
        try (Connection con = new ConnectionFactoryImpl().getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while(rs.next()) {
                list.add(new ClientModel(
                    rs.getInt("id"),
                    rs.getString("client_name"),
                    rs.getString("designation"),
                    rs.getString("description"),
                    rs.getString("image")
                ));
            }
        } catch(Exception e) { e.printStackTrace(); }
        return list;
    }
}
