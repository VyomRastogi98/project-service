package com.axis.projectservice.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axis.projectservice.entity.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {
	
	@Modifying
	@Query("update Project set projectName=?1, projectDescription=?2, projectFlowChart=?3 where projectId=?4")
	void updateProjectInfo(String projectName,String projectDescription,String projectFlowChart,
			int projectId);
	
}
