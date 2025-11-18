package com.projectTask.controller.userController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projectTask.model.userModel.ClientModel;
import com.projectTask.model.userModel.ProjectModel;
import com.projectTask.service.userService.ClientService;
import com.projectTask.service.userService.ClientServiceImpl;
import com.projectTask.service.userService.ProjectService;
import com.projectTask.service.userService.ProjectServiceImpl;


@WebServlet("/homePage")
public class HomePaget extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Fetch projects
            ProjectService projectService = new ProjectServiceImpl();
            List<ProjectModel> projectList = projectService.getProjects();
            request.setAttribute("projectList", projectList);

            // Fetch clients
            ClientService clientService = new ClientServiceImpl();
            List<ClientModel> clientList = clientService.getAllClients();
            request.setAttribute("clientList", clientList);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Forward to index.jsp
        request.getRequestDispatcher("/index.jsp").forward(request, response);
        return;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
