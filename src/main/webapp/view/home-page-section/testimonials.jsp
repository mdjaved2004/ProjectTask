<%@page import="com.projectTask.model.userModel.ClientModel"%>
<%@page import="java.util.List"%>
<div class="container">
    <h2 class="section-title">Happy Clients</h2>
    <div class="testimonials-grid">
        <% 
            List<ClientModel> clients = (List<ClientModel>) request.getAttribute("clientList");
            if (clients != null) {
                for (ClientModel client : clients) {
        %>
            <div class="testimonial-card">
                <img src="<%=request.getContextPath()%>/assets/client-images/<%=client.getImage()%>" 
                     alt="Client Photo" 
                     class="client-photo">
                <p class="quote"><%=client.getDescription()%></p>
                <h4 class="client-name"><%=client.getClientName()%></h4>
                <h5 class="client-designation"><%=client.getDesignation()%></h5>
            </div>
        <% 
                }
            }
        %>
    </div>
</div>
