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

import com.projectTask.model.userModel.ClientModel;
import com.projectTask.service.adminService.ClientService;
import com.projectTask.service.adminService.ClientServiceImpl;

@WebServlet("/addClient")
@MultipartConfig
public class ClientAddServlet extends HttpServlet {
    private ClientService service = new ClientServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("client_name");
        String designation = request.getParameter("designation");
        String desc = request.getParameter("description");
        Part filePart = request.getPart("image");
        String fileName = filePart.getSubmittedFileName();
        String uploadPath = getServletContext().getRealPath("/assets/client-images/") + fileName;
        filePart.write(uploadPath);

        ClientModel client = new ClientModel(name, designation, desc, fileName);
        if(service.addClient(client)) {
            request.setAttribute("message", "Client added successfully!");
        } else {
            request.setAttribute("message_error", "Failed to add client!");
        }
        RequestDispatcher rd = request.getRequestDispatcher("/adminClient");
		rd.forward(request, response);
		return;
    }
}
