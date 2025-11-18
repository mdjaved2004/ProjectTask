package com.projectTask.controller.adminController;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projectTask.service.adminService.ClientService;
import com.projectTask.service.adminService.ClientServiceImpl;

@WebServlet("/deleteClient")
public class ClientDeleteServlet extends HttpServlet {
    private ClientService service = new ClientServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idStr = request.getParameter("id");
        if(idStr != null && !idStr.isEmpty()) {
            int id = Integer.parseInt(idStr);
            if(service.deleteClient(id)) {
                request.setAttribute("message", "Client deleted successfully!");
            } else {
                request.setAttribute("message_error", "Failed to delete client!");
            }
        } else {
            request.setAttribute("message_error", "Invalid client ID!");
        }
        RequestDispatcher rd = request.getRequestDispatcher("/adminClient");
		rd.forward(request, response);
		return;
    }
}
