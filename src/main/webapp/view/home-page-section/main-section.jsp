<%String projectPath = request.getContextPath(); %>

<div class="main-section-text">
    <h1>Consultation, Design & Marketing</h1>
</div>
<div class="main-section-form-container">
    <%-- <form action="<%=projectPath %>/submitQuote" method="POST" class="main-section-form">
        <h3>Get a Free Quote for Contact</h3>
        <div class="form-group">
            <input type="text" name="name" placeholder="Name" required>
        </div>
        <div class="form-group">
            <input type="tel" name="phone" placeholder="Phone" pattern="[0-9]{10}" title="Enter 10-digit phone number" required>
        </div>
        <div class="form-group">
            <select name="service" required>
                <option value="" disabled selected>Select Service</option>
                <option value="consultation">Consultation</option>
                <option value="design">Design</option>
                <option value="marketing">Marketing</option>
            </select>
        </div>
        <div class="form-group">
            <textarea name="message" placeholder="Message"></textarea>
        </div>
        <button type="submit" class="btn btn-primary">Submit Now</button>
    </form> --%>
    <form action="<%=projectPath %>/submitContact" method="POST" class="main-section-form">
    <h3>Get a Free Quote / Contact</h3>

    <div class="form-group">
        <input type="text" name="full_name" placeholder="Full Name" required>
    </div>

    <div class="form-group">
        <input type="email" name="email" placeholder="Email" required>
    </div>

    <div class="form-group">
        <input type="tel" name="mobile" placeholder="Mobile" pattern="[0-9]{10}" title="Enter 10-digit mobile number" required>
    </div>

    <div class="form-group">
        <input type="text" name="city" placeholder="City" required>
    </div>

    <button type="submit" class="btn btn-primary">Submit Now</button>
</form>
    
</div>