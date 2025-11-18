working frontend and backend 
1. Complete frontend code, using jsp, css, and js
2. Comple backend code , using java ,Servlet(Proper structured).

📌 ProjectTask

ProjectTask is a Java-based web application designed to help users submit contact messages and request service quotes while providing an admin panel to manage projects, clients, contact submissions, and newsletter subscriptions. The project demonstrates full-stack Java web development with JSP, Servlets, MySQL, and dynamic frontend interactions.

💻 Key Features
🧑 User Side

📝 Contact Form – Users can submit their name, email, phone number, and city.

💬 Quote Request Form – Users can request service quotes by entering name, phone, service type, and message.

✅ Form Validation – Ensures required fields are filled and phone numbers are correct (10-digit validation).

🏛 Admin Side

📂 Project Management – Admin can add projects with name, description, and image.

👥 Client Management – Admin can add clients with name, designation (e.g., CEO, Designer), description, and image.

📋 View Contact Messages – Admin can see all user-submitted contact forms.

📧 Newsletter Management – Admin can view all subscribed email addresses.

🗄 Database Tables
Table Name	Columns
projects	id, project_name, project_desc, image
clients	id, client_name, designation, description, image
contact	id, full_name, email, mobile, city
newsletter	id, email

All tables are created with CREATE TABLE IF NOT EXISTS, ensuring no duplicate tables.

🛠 Technologies Used

Backend: Java, JSP, Servlets

Frontend: HTML, CSS, JavaScript

Database: MySQL

Database Connectivity: JDBC

⚙ How It Works

Users fill contact or quote forms on the frontend.

Data is validated in the backend using Servlets and service classes.

Valid data is stored in the MySQL database.

Admin panel allows viewing projects, clients, messages, and newsletter emails.

Dynamic alerts are displayed for success or errors during form submission.

🚀 Deployment

Can be deployed on Railway.com or any Java-supporting cloud hosting.

Connect MySQL database using environment variables provided by the hosting platform.

Can run on a Tomcat server or inside a Docker container for easy deployment.

After deployment, the website is accessible through a public URL.

📌 Summary

ProjectTask covers the complete frontend and backend stack for a small business or service-oriented platform. Users can communicate with the platform via forms, and admin has full control over projects, clients, contacts, and newsletters. It is an example of practical full-stack Java web development combining JSP, Servlets, MySQL, and dynamic user interaction.
