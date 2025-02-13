package com.srti.JobApp.service;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srti.JobApp.model.JobPost;
import com.srti.JobApp.repo.JobRepo;


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
	
	
}
