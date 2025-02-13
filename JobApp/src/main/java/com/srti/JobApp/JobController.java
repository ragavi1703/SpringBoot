package com.srti.JobApp;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.srti.JobApp.model.JobPost;
import com.srti.JobApp.service.JobService;

import org.springframework.ui.Model;


@Controller
public class JobController {
	
	@Autowired
	private JobService service;

	@GetMapping({"/","/home"})
	public String home() {
	return "home";
	}
	
	@GetMapping("/addjob")
	public String addJob() {
		return "addjob";
	}
	
	@PostMapping("handleForm")
	public String handleForm(JobPost jobpost) {
		service.addJob(jobpost);
		return "success";
	}
	
	
	@GetMapping("viewalljobs")
	public String viewJobs(Model model) {
		
		List <JobPost> jobs= service.getAllJobs();
		model.addAttribute("jobPosts",jobs);
		return "viewalljobs";
	}
	
	
}
