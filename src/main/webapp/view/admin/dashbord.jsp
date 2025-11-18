<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String projectPath = request.getContextPath(); %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Panel</title>
    <link rel="stylesheet" href="<%=projectPath%>/css/admin-view-pages-css/admin-dashbord.css">
</head>
<body>
    <header class="admin-header">
     	<%@ include 	file="/view/admin/admin-nav.jsp"%>
    </header>
    <main>
        <h2>Welcome, Admin</h2>
        <p>Select a section from the menu to manage content.</p>
    </main>
</body>
</html>
