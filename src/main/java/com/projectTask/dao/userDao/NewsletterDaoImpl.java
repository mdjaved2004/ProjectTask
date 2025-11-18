package com.projectTask.dao.userDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.projectTask.dao.connections.ConnectionFactoryImpl;
import com.projectTask.eventHandler.DBConnection;
import com.projectTask.model.userModel.NewsletterModel;


public class NewsletterDaoImpl implements NewsletterDao {

    @Override
    public String[] saveEmail(NewsletterModel model) {
    		String message_arr[] =new String[2];
        String checkSql ="SELECT * FROM projecttask.newsletter WHERE email = ?";
        String insertSql = "INSERT INTO projecttask.newsletter (email) VALUES (?)";

        
        try (Connection con = new ConnectionFactoryImpl().getConnection()) {
        		con.setAutoCommit(false);
        		
            // Check if email already exists
            PreparedStatement checkPs = con.prepareStatement(checkSql);
            checkPs.setString(1, model.getEmail());
            ResultSet rs = checkPs.executeQuery();
            if (rs.next()) {
	            	message_arr[0]="Already subscribe this email";
            }

            if(message_arr[0]==null) {
	            	// Insert new email
	            PreparedStatement insertPs = con.prepareStatement(insertSql);
	            insertPs.setString(1, model.getEmail());
	            int rows = insertPs.executeUpdate();
	            if (rows > 0) {
	            		message_arr[0]="subscribed successfully this email";
	            }else {
	            		message_arr[1]="Something went wrong, Try again";
	            }
            }
            con.commit();
            return message_arr;
        } catch (Exception e) {
            message_arr[1]="Something went wrong, Try again";
            return message_arr;
        }
    }
    
    @Override
    public List<NewsletterModel> getAllEmails() {
        List<NewsletterModel> list = new ArrayList<>();
        String sql = "SELECT * FROM newsletter";
        try (Connection con = new ConnectionFactoryImpl().getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while(rs.next()) {
                list.add(new NewsletterModel(rs.getInt("id"), rs.getString("email")));
            }
        } catch(Exception e) { e.printStackTrace(); }
        return list;
    }
}
