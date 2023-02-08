package com.axis.projectservice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.projectservice.entity.Project;
import com.axis.projectservice.exception.ProjectNotFoundException;
import com.axis.projectservice.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public Project getProjectById(int projectId) {
		Optional<Project> projectOpt = projectRepository.findById(projectId);
		if(!projectOpt.isPresent())
			throw new ProjectNotFoundException("Project Not Found by Id "+projectId);
		return projectOpt.get();
	}

	@Override
	public List<Project> getAllProject() {
		
		return (List<Project>) projectRepository.findAll();
	}
	
	@Override
	public void addProject(Project project) {
		projectRepository.save(project);
	}

	@Override
	public void deleteProjectById(int projectId) {
		Optional<Project> projectOpt = projectRepository.findById(projectId);
		if(!projectOpt.isPresent())
			throw new ProjectNotFoundException("Project Not Found by Id "+projectId);
		projectRepository.deleteById(projectId);

	}

	@Transactional
	@Override
	public void updateProjectById(int projectId, Project project) {
		projectRepository.updateProjectInfo(project.getProjectName(),
											project.getProjectDescription(), 
											project.getProjectFlowChart(), 
											project.getProjectId());

	}

}
