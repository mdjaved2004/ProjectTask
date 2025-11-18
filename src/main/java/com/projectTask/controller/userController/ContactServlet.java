package com.projectTask.controller.userController;

import com.projectTask.model.userModel.ContactModel;
import com.projectTask.service.userService.ContactService;
import com.projectTask.service.userService.ContactServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/submitContact")
public class ContactServlet extends HttpServlet {

    private ContactService service = new ContactServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullName = request.getParameter("full_name");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String city = request.getParameter("city");

        if(fullName == null || fullName.trim().isEmpty() ||
           email == null || email.trim().isEmpty() ||
           mobile == null || mobile.trim().isEmpty() ||
           city == null || city.trim().isEmpty()) {

            request.setAttribute("error_message", "Please fill all required fields!");
            RequestDispatcher rd = request.getRequestDispatcher("/homePage");
            rd.forward(request, response);
            return;
        }

        ContactModel contact = new ContactModel(fullName, email, mobile, city);
        String resultMessage = service.submitContact(contact);

        request.setAttribute("message", resultMessage);
        RequestDispatcher rd = request.getRequestDispatcher("/homePage");
        rd.forward(request, response);
    }
}
