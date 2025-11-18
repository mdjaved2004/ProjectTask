package com.projectTask.controller.adminController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projectTask.service.adminService.ProjectAddService;
import com.projectTask.service.adminService.ProjectAddServiceImpl;

@WebServlet("/projectDelete")
public class ProjectDeleteServlet extends HttpServlet {
    private ProjectAddService service = new ProjectAddServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("id");
        if (idStr != null && !idStr.isEmpty()) {
            int id = Integer.parseInt(idStr);
            boolean deleted = service.deleteProject(id);
            if(deleted) {
                request.setAttribute("message", "Project deleted successfully!");
            } else {
                request.setAttribute("error_message", "Failed to delete project!");
            }
        } else {
            request.setAttribute("error_message", "Invalid project ID!");
        }
        RequestDispatcher rd = request.getRequestDispatcher("/adminProject");
		rd.forward(request, response);
    }
}
