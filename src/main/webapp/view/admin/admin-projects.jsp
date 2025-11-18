<%@page import="com.projectTask.model.userModel.ProjectModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <% String projectPath = request.getContextPath(); %>  
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Manage Projects</title>
     <link rel="stylesheet" href="<%=projectPath%>/css/admin-view-pages-css/admin-dashbord.css">
    <link rel="stylesheet" href="<%= projectPath%>/css/admin-view-pages-css/admin-addproject.css">
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
	    <h2>Project Management</h2>
	    <form action="<%= projectPath %>/projectAdd" method="POST" enctype="multipart/form-data">
	        <input type="text" name="project_name" placeholder="Project Name" required>
	        <textarea name="project_desc" placeholder="Project Description" required></textarea>
	        <input type="file" name="image" required>
	        <button type="submit">Add Project</button>
	    </form>
	    <hr>
	    <h3>All Projects</h3>
	    <table border="1">
	        <tr>
	            <th>ID</th><th>Name</th><th>Description</th><th>Image</th><th>Action</th>
	        </tr>
	        <%-- iterate over projects from servlet --%>
	        <% 
	            List<ProjectModel> projects = (List<ProjectModel>) request.getAttribute("projectList");
	            if(projects != null) {
	                for(ProjectModel p : projects) {
	        %>
	        <tr>
	            <td><%=p.getId()%></td>
	            <td><%=p.getProjectName()%></td>
	            <td><%=p.getProjectDesc()%></td>
	            <td><img src="<%=request.getContextPath()%>/assets/<%=p.getImage()%>" width="50"/></td>
	            <td><a href="<%= projectPath %>/projectDelete?id=<%=p.getId()%>">Delete</a></td>
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
