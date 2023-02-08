package com.axis.projectservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Project {

	@Id
	@GeneratedValue
	private int projectId;
	private String projectName;
	private String projectDescription;
	private String projectFlowChart;
	

	public Project() {
		
	}

	public Project(int projectId, String projectName, String projectDescription, String projectFlowChart) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.projectFlowChart = projectFlowChart;
		
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getProjectFlowChart() {
		return projectFlowChart;
	}

	public void setProjectFlowChart(String projectFlowChart) {
		this.projectFlowChart = projectFlowChart;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectDescription="
				+ projectDescription + ", projectFlowChart=" + projectFlowChart + "]";
	}	
	
}
