package com.projectTask.dao.adminDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.projectTask.dao.connections.ConnectionFactoryImpl;
import com.projectTask.model.adminModel.ContactModel;

public class ContactDaoImpl implements ContactDao {

    @Override
    public List<ContactModel> getAllContacts() {
        List<ContactModel> list = new ArrayList<>();
        String sql = "SELECT * FROM contact";

        try (Connection con = new ConnectionFactoryImpl().getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while(rs.next()) {
                ContactModel c = new ContactModel(
                    rs.getInt("id"),
                    rs.getString("full_name"),
                    rs.getString("email"),
                    rs.getString("mobile"),
                    rs.getString("city")
                );
                list.add(c);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
