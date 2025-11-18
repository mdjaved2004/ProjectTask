package com.projectTask.controller.adminController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projectTask.model.userModel.NewsletterModel;
import com.projectTask.service.userService.NewsletterService;
import com.projectTask.service.userService.NewsletterServiceImpl;

@WebServlet("/subscribedEmail")
public class NewsletterOpenPageServlet extends HttpServlet {
    private NewsletterService service = new NewsletterServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<NewsletterModel> emails = service.getAllEmails();
        request.setAttribute("newsletterList", emails);
        request.getRequestDispatcher("/view/admin/SubscribedEmail.jsp").forward(request, response);
        return;
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		doPost(request, response);
    }
}