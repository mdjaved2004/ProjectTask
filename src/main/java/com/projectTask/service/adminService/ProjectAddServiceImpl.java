package com.projectTask.service.adminService;

import com.projectTask.dao.adminDao.ProjectAddDao;
import com.projectTask.dao.adminDao.ProjectAddDaoImpl;
import com.projectTask.model.adminModel.ProjectAddModel;

public class ProjectAddServiceImpl implements ProjectAddService {
    private ProjectAddDao dao = new ProjectAddDaoImpl();

    @Override
    public boolean addProject(ProjectAddModel project) {
        return dao.addProject(project);
    }
    
    @Override
    public boolean deleteProject(int id) {
        return dao.deleteProject(id);
    }

}
