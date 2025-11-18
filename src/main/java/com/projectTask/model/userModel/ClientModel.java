package com.projectTask.model.userModel;

public class ClientModel {
    private int id;
    private String clientName;
    private String designation;
    private String description;
    private String image;

    public ClientModel() {}

    public ClientModel(int id, String clientName, String designation, String description, String image) {
        this.id = id;
        this.clientName = clientName;
        this.designation = designation;
        this.description = description;
        this.image = image;
    }
    public ClientModel(String clientName, String designation, String description, String image) {
        this.clientName = clientName;
        this.designation = designation;
        this.description = description;
        this.image = image;
    }
    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getClientName() { return clientName; }
    public void setClientName(String clientName) { this.clientName = clientName; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}
