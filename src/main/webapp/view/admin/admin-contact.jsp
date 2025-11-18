<%@page import="com.projectTask.model.adminModel.ContactModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%String projectPath = request.getContextPath(); %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contact Form Responses</title>
   <link rel="stylesheet" href="<%=projectPath%>/css/admin-view-pages-css/admin-dashbord.css">
    <link rel="stylesheet" href="<%=projectPath%>/css/admin-view-pages-css/admin-addproject.css">
</head>
<body>
	<%
	    String message = (String) request.getAttribute("message");
	    String message_error = (String) request.getAttribute("error_message");
	%>
	
	<header class="admin-header">
     	<%@ include 	file="/view/admin/admin-nav.jsp"%>
    </header>
	<main>
	    <h2>Contact Form Details</h2>
	    <table border="1">
	        <tr>
	            <th>ID</th><th>Full Name</th><th>Email</th><th>Mobile</th><th>City</th>
	        </tr>
	        <% 
	            List<ContactModel> contacts = (List<ContactModel>) request.getAttribute("contactList");
	            if(contacts != null) {
	                for(ContactModel c : contacts) {
	        %>
	        <tr>
	            <td><%=c.getId()%></td>
	            <td><%=c.getFullName()%></td>
	            <td><%=c.getEmail()%></td>
	            <td><%=c.getMobile()%></td>
	            <td><%=c.getCity()%></td>
	        </tr>
	        <% }} %>
	    </table> 
	   </main>
	   
	  <script>
	    var successMessage = "<%= message != null ? message : "" %>";
	    var errorMessage = "<%= message_error != null ? message_error : "" %>";
	</script>

	<script src="<%=projectPath %>/js/user-view-pages-js/message-alert.js"></script>
</body>
</html>
