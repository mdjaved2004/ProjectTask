working frontend and backend 
1. Complete frontend code, using jsp, css, and js
2. Comple backend code , using java ,Servlet(Proper structured).

ProjectTask
Description

ProjectTask is a Java-based web application. Users can submit contact messages and request quotes. Admin can manage projects, clients, contact messages, and newsletter subscriptions easily.

Features
User Side

Submit contact form with name, email, phone, and city.

Submit quote request with name, phone, service type, and message.

Validation for empty fields and correct phone number.

Admin Side

Add projects with name, description, and image.

Add clients with name, designation, description, and image.

View all contact messages submitted by users.

View subscribed email addresses in newsletter.

Database Tables

projects – id, project_name, project_desc, image

clients – id, client_name, designation, description, image

contact – id, full_name, email, mobile, city

newsletter – id, email

Technologies Used

Java, JSP, Servlets

MySQL Database

HTML, CSS, JavaScript

JDBC for database connection

How It Works

Users submit forms → validated in backend → stored in MySQL database.

Admin panel shows projects, clients, contact messages, and newsletter emails.

Success or error messages are displayed dynamically.

Deployment

Can be deployed on platforms like Railway.com.

Connect MySQL using environment variables.

Run on Tomcat server or use Docker.

