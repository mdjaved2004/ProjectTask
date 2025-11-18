 <%String project_Path = request.getContextPath(); %>
 <a href="<%= project_Path %>/homePage" id="nav-logo"><span>Project</span><span>Task</span></a>
 <nav>
     <ul>
         <li><a href="<%= project_Path %>/adminProject">Projects</a></li>
         <li><a href="<%= project_Path %>/adminClient">Clients</a></li>
         <li><a href="<%= project_Path %>/contactPage">Contact Form</a></li>
         <li><a href="<%= project_Path %>/subscribedEmail">Subscribed Emails</a></li>
     </ul>
 </nav>