package com.projectTask.controller.userController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.projectTask.service.userService.NewsletterService;
import com.projectTask.service.userService.NewsletterServiceImpl;


@WebServlet("/subscribe")
public class SubscribeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");

        NewsletterService service = new NewsletterServiceImpl();
        
        String[] subscribeEmail = service.subscribeEmail(email);

        if(subscribeEmail[0]!=null) {
        		request.setAttribute("message", subscribeEmail[0]);
        		 System.out.println(subscribeEmail[0]);
        }else {
        		request.setAttribute("error_message", subscribeEmail[1]);
        		System.out.println(subscribeEmail[1]);
        }

        RequestDispatcher rd = request.getRequestDispatcher("/homePage");
		rd.forward(request, response);
		return;
    }
}
