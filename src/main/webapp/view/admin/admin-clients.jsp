<%@page import="com.projectTask.model.userModel.ClientModel"%>
<%@page import="java.util.List"%>
<%String projectPath = request.getContextPath(); %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Manage Clients</title>
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
	    <h2>Client Management</h2>
	    <form action="<%= projectPath %>/addClient" method="POST" enctype="multipart/form-data">
	        <input type="text" name="client_name" placeholder="Client Name" required>
	        <input type="text" name="designation" placeholder="Designation" required>
	        <textarea name="description" placeholder="Description"></textarea>
	        <input type="file" name="image" required>
	        <button type="submit">Add Client</button>
	    </form>
	    <hr>
	    <h3>All Clients</h3>
	    <table border="1">
	        <tr>
	            <th>ID</th><th>Name</th><th>Designation</th><th>Description</th><th>Image</th><th>Action</th>
	        </tr>
	        <% 
	            List<ClientModel> clients = (List<ClientModel>) request.getAttribute("clientList");
	            if(clients != null) {
	                for(ClientModel c : clients) {
	        %>
	        <tr>
	            <td><%=c.getId()%></td>
	            <td><%=c.getClientName()%></td>
	            <td><%=c.getDesignation()%></td>
	            <td><%=c.getDescription()%></td>
	            <td><img src="<%=projectPath%>/assets/client-images/<%=c.getImage()%>" width="50"/></td>
	            <td><a href="<%=projectPath%>/deleteClient?id=<%=c.getId()%>">Delete</a></td>
	        </tr>
	        <% }} %>
	    </table>
	  </main>
	  <!-- assign value  -->
	<script>
	    var successMessage = "<%= message != null ? message : "" %>";
	    var errorMessage = "<%= message_error != null ? message_error : "" %>";
	</script>

	<script src="<%=projectPath %>/js/user-view-pages-js/message-alert.js"></script>
</body>
</html>
