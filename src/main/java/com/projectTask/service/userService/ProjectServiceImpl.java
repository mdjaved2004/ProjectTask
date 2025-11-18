package com.projectTask.service.userService;

import java.util.List;

import com.projectTask.dao.userDao.ProjectDao;
import com.projectTask.dao.userDao.ProjectDaoImpl;
import com.projectTask.model.userModel.ProjectModel;


public class ProjectServiceImpl implements ProjectService {

    private ProjectDao dao = new ProjectDaoImpl();

    @Override
    public List<ProjectModel> getProjects() {
        return dao.getAllProjects();
    }
}
