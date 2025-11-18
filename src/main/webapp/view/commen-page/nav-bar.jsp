<%String projectPath = request.getContextPath(); %>
<nav id="nav-bar">
    <a href="#" id="nav-logo"><span>Project</span><span>Task</span></a>
    <ul class="nav-ul">
        <li><a href="#" class="nav-bar-item">Home</a></li>
        <li><a href="#services" class="nav-bar-item">Service</a></li>
        <li><a href="#about" class="nav-bar-item">About</a></li>
        <li><a href="#testimonials" class="nav-bar-item">Testimonials</a></li>
        <li><a href="<%=projectPath %>/view/admin/dashbord.jsp" id="admin-pannel" class="nav-bar-item">Admin Pannel</a></li>
    </ul>
</nav>