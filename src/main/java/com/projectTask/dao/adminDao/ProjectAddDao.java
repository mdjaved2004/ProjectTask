package com.projectTask.dao.adminDao;

import com.projectTask.model.adminModel.ProjectAddModel;

public interface ProjectAddDao {
    boolean addProject(ProjectAddModel project);
    
    boolean deleteProject(int id);

}
