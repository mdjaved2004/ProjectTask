package com.projectTask.service.adminService;

import com.projectTask.model.adminModel.ProjectAddModel;

public interface ProjectAddService {
    boolean addProject(ProjectAddModel project);
    boolean deleteProject(int id);
}
