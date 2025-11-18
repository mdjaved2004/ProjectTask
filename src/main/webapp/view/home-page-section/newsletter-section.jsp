<%String projectPath = request.getContextPath(); %>
<div class="newsletter-container">		
	<div class="newsletter-left">
	    <a href="#">Home</a>
	    <a href="#">Services</a>
	    <a href="#">Projects</a>
	    <a href="#">Testimonials</a>
	    <a href="#">Contact</a>
  	</div>

	<div class="newsletter-right">
	  <form action="<%= projectPath %>/subscribe" method="post" class="newsletter-form">
	        <span>Subscribe Us</span>
	
	        <input type="email" name="email" pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}" 
	        	title="Please enter a valid email address (e.g., name@example.com)." 
	        maxlength="50" placeholder="Enter Email Address"  required>
	
	        <button type="submit">Subscribe</button>
	    </form>
	</div>
</div>