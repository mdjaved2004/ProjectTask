<%@page import="com.projectTask.model.userModel.NewsletterModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%String projectPath = request.getContextPath(); %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Subscribed Users</title>
    <link rel="stylesheet" href="<%=projectPath%>/css/admin-view-pages-css/admin-dashbord.css">
    <link rel="stylesheet" href="<%=projectPath%>/css/admin-view-pages-css/admin-addproject.css">
</head>
<body>
	<header class="admin-header">
     	<%@ include 	file="/view/admin/admin-nav.jsp"%>
    </header>
	<main>
	    <h2>Subscribed Email Addresses</h2>
	    <table border="1">
	        <tr>
	            <th>ID</th><th>Email</th>
	        </tr>
	        <% 
	            List<NewsletterModel> emails = (List<NewsletterModel>) request.getAttribute("newsletterList");
	            if(emails != null) {
	                for(NewsletterModel n : emails) {
	        %>
	        <tr>
	            <td><%=n.getId()%></td>
	            <td><%=n.getEmail()%></td>
	        </tr>
	        <% }} %>
	    </table>
	 </main>
</body>
</html>
