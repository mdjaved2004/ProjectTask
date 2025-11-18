package com.projectTask.model.adminModel;

public class ProjectAddModel {
	private String projectName;
    private String projectDesc;
    private String image;
	
    public ProjectAddModel(String projectName, String projectDesc, String image) {
		super();
		this.projectName = projectName;
		this.projectDesc = projectDesc;
		this.image = image;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDesc() {
		return projectDesc;
	}

	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
    
        
}
