<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%String projectPath = request.getContextPath(); %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>com.ProjectTask</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200&icon_names=search" />
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <link href="<%=request.getContextPath()%>/css/user-view-pages-css/style.css" type="text/css" rel="stylesheet">
</head>
<body>
	<%
	    String message = (String) request.getAttribute("message");
	    String message_error = (String) request.getAttribute("error_message");
	%>
	
    <header id="header">
        <jsp:include page="/view/commen-page/nav-bar.jsp" /> 
    </header>

    <main class="main">
   			<!--  Main section -->
		 <section class="main-section section" >
            <jsp:include page="/view/home-page-section/main-section.jsp" /> 
        </section>
        
        <!-- Intro section -->
        <section id="intro" class="intro-section section">
            <jsp:include page="/view/home-page-section/intro-section.jsp" /> 
        </section>

        <!-- Service section-->
        <section id="services" class="services-section">
            <jsp:include page="/view/home-page-section/services-section.jsp" />           
        </section>

        <!-- Gallery section -->
        <section id="gallery" class="gallery-section container">
            <jsp:include page="/view/home-page-section/gallery-section.jsp" /> 
        </section>

        <!-- About section -->
        <section id="about" class="about-section">
            <jsp:include page="/view/home-page-section/about-section.jsp" /> 
        </section>

        <!-- Project section -->
        <section id="projects" class="projects-section">
            <jsp:include page="/view/home-page-section/projects-section.jsp" /> 
        </section>

        <!-- Testimonials section  -->
        <section id="testimonials" class="testimonials-section">
            <jsp:include page="/view/home-page-section/testimonials.jsp" /> 
        </section>

        <!--CTA Section-->
        <section id="contact" class="cta-section">
           <jsp:include page="/view/home-page-section/contact-section.jsp" /> 
        </section>
        
        <!--Newsletter section-->
        <section class="newsletter-section">
		    <jsp:include page="/view/home-page-section/newsletter-section.jsp" /> 
		</section>
    </main>

    <footer class="footer">
        <jsp:include page="/view/commen-page/footer.jsp" /> 
    </footer>

<!-- assign value  -->
	<script>
	    var successMessage = "<%= message != null ? message : "" %>";
	    var errorMessage = "<%= message_error != null ? message_error : "" %>";
	</script>

	<script src="<%=projectPath %>/js/user-view-pages-js/message-alert.js"></script>
</body>
</html>