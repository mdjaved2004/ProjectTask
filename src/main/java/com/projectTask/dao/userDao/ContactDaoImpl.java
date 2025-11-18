package com.projectTask.dao.userDao;

import com.projectTask.model.userModel.ContactModel;
import com.projectTask.dao.connections.ConnectionFactoryImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ContactDaoImpl implements ContactDao {

    @Override
    public boolean saveContact(ContactModel contact) {
        String sql = "INSERT INTO contact (full_name, email, mobile, city) VALUES (?, ?, ?, ?)";
        try (Connection con = new ConnectionFactoryImpl().getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, contact.getFullName());
            ps.setString(2, contact.getEmail());
            ps.setString(3, contact.getMobile());
            ps.setString(4, contact.getCity());

            int rows = ps.executeUpdate();
            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
