package com.projectTask.dao.adminDao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.projectTask.dao.connections.ConnectionFactoryImpl;
import com.projectTask.model.adminModel.ProjectAddModel;

public class ProjectAddDaoImpl implements ProjectAddDao {

    @Override
    public boolean addProject(ProjectAddModel project) {
        String sql = "INSERT INTO projects (project_name, project_desc, image) VALUES (?,?,?)";
        try (Connection con = new ConnectionFactoryImpl().getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, project.getProjectName());
            ps.setString(2, project.getProjectDesc());
            ps.setString(3, project.getImage());
            return ps.executeUpdate() > 0;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    public boolean deleteProject(int id) {
        String sql = "DELETE FROM projects WHERE id=?";
        try (Connection con = new ConnectionFactoryImpl().getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
