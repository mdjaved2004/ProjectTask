package com.projectTask.controller.adminController;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
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


@WebServlet("/adminClient")
public class AdminClientsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
            // Fetch clients
            ClientService clientService = new ClientServiceImpl();
            List<ClientModel> clientList = clientService.getAllClients();
            request.setAttribute("clientList", clientList);

        } catch (Exception e) {
            e.printStackTrace();
        }
        RequestDispatcher rd = request.getRequestDispatcher("/view/admin/admin-clients.jsp");
		rd.forward(request, response);
		return;
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}

	

}
