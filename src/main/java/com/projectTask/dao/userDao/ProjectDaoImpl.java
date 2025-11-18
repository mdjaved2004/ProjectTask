package com.projectTask.dao.userDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.projectTask.dao.connections.ConnectionFactoryImpl;
import com.projectTask.model.userModel.ProjectModel;

public class ProjectDaoImpl implements ProjectDao {

    @Override
    public List<ProjectModel> getAllProjects() {

        List<ProjectModel> list = new ArrayList<>();

        String sql = "SELECT * FROM projects";

        try (Connection con = new ConnectionFactoryImpl().getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                ProjectModel p = new ProjectModel();
                p.setId(rs.getInt("id"));
                p.setProjectName(rs.getString("project_name"));
                p.setProjectDesc(rs.getString("project_desc"));
                p.setImage(rs.getString("image"));

                list.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
}
