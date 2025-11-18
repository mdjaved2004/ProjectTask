package com.projectTask.controller.adminController;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projectTask.model.adminModel.ContactModel;
import com.projectTask.service.adminService.ContactService;
import com.projectTask.service.adminService.ContactServiceImpl;

@WebServlet("/contactPage")
public class ContactPageServlet extends HttpServlet {

    private ContactService service = new ContactServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ContactModel> contacts = service.getAllContacts();
        request.setAttribute("contactList", contacts);

        RequestDispatcher rd = request.getRequestDispatcher("/view/admin/admin-contact.jsp"); // JSP page name
        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
