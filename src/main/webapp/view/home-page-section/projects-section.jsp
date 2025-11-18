<%@page import="com.projectTask.model.userModel.ProjectModel"%>
<%@page import="java.util.List"%>

<% String projectPath = request.getContextPath();
	List<ProjectModel> projectList = (List<ProjectModel>) request.getAttribute("projectList");
%>



<div class="container">
    <h2 class="section-title">Our Projects</h2>
    <p class="section-subtitle">We know what buyers and sellers want and what they need to get the job done.</p>
    
    <div class="projects-container">
	<%if(projectList != null && !projectList.isEmpty()){
		for(ProjectModel p : projectList){
	%>

        <div class="project-card">
            <img src="<%=projectPath%>/assets/<%=p.getImage()%>" alt="Project Image" class="project-img">
            <div class="project-content">
                <h3><%=p.getProjectName()%></h3>
				<p><%=p.getProjectDesc()%></p>
                <a href="#" class="btn btn-primary btn-small">READ MORE</a>
            </div>
        </div>     
        <%}
        }%>
       
    </div>
</div>