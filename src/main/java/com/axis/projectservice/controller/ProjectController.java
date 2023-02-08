package com.axis.projectservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.projectservice.entity.Project;
import com.axis.projectservice.service.ProjectService;

@CrossOrigin("http://localhost:3000/")
@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	public ProjectController() {
		
	}

	public ProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	@GetMapping("/project/{projectId}")
	public Project getProjectById(@PathVariable int projectId) {
		return projectService.getProjectById(projectId);
	}
	
	@GetMapping("/projects")
	public List<Project> getAllProject(){
		return projectService.getAllProject();
	}
	
	@PostMapping("/project")
	public ResponseEntity<String> addProject(@RequestBody Project project){
		projectService.addProject(project);
		return new ResponseEntity<String>("Project Added Successfully..",HttpStatus.OK);
	}
	
	@DeleteMapping("/project/{projectId}")
	public ResponseEntity<String> deleteProjectById(@PathVariable int projectId){
		projectService.deleteProjectById(projectId);
		return new ResponseEntity<String>("Project deleted Successfully..",HttpStatus.OK);
	}
	
	@PutMapping("/project/update/{projectId}")
	public ResponseEntity<String> updateProjectInfo(@PathVariable int projectId, @RequestBody Project project){
		projectService.updateProjectById(projectId, project);
		return new ResponseEntity<String>("Project Updated Successfully..",HttpStatus.OK);
	}	
}
