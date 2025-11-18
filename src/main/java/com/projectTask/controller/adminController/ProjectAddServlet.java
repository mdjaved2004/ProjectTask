package com.projectTask.controller.adminController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.projectTask.model.adminModel.ProjectAddModel;
import com.projectTask.service.adminService.ProjectAddService;
import com.projectTask.service.adminService.ProjectAddServiceImpl;

@WebServlet("/projectAdd")
@MultipartConfig
public class ProjectAddServlet extends HttpServlet {
    private ProjectAddService service = new ProjectAddServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("project_name");
        String desc = request.getParameter("project_desc");
        Part filePart = request.getPart("image");
        String fileName = filePart.getSubmittedFileName();
        String uploadPath = getServletContext().getRealPath("/assets/") + fileName;
        filePart.write(uploadPath);

        ProjectAddModel project = new ProjectAddModel(name, desc, fileName);

        if(service.addProject(project)) {
            request.setAttribute("message", "Project added successfully!");
        } else {
            request.setAttribute("error_message", "Failed to add project!");
        }
        RequestDispatcher rd = request.getRequestDispatcher("/adminProject");
		rd.forward(request, response);
		return;
    }
}
