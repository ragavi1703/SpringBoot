package com.srti.spring_boot_rest.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srti.spring_boot_rest.model.JobPost;
import com.srti.spring_boot_rest.repo.JobRepo;



@Service
public class JobService {
	
	@Autowired
	private JobRepo repo;

	
	public void addJob(JobPost jobpost) {
		repo.addJob(jobpost);
		
		
		
	}
	
	public List<JobPost> getAllJobs(){
		return repo.getAllJobs();
		
	}

	public JobPost getJob(int postId) {
		
		return repo.getJob(postId);
	}

	public void updateJob(JobPost jobPost) {
		
		 repo.updateJob(jobPost);
	}

	public void deleteJob(int postId) {
		
		 repo.deleteJob(postId);
	}

	

	
	
	
}
