package com.axis.projectservice.service;

import java.util.List;

import com.axis.projectservice.entity.Project;

public interface ProjectService {

	Project getProjectById(int projectId);
	List<Project> getAllProject();
	void addProject(Project project);
	void deleteProjectById(int projectId);
	void updateProjectById(int projectId, Project project);

}
