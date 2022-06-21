package com.app.efa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.efa.Entity.Job;
import com.app.efa.Service.JobService;

@RestController
public class JobController {

	@Autowired
	private JobService jobService;

	@RequestMapping("addjob")
	public String addSkill(Job job) {
		// adding job to database
		jobService.addJob(job);
		return "addjob.jsp";
	}

	@RequestMapping("getjob")
	public String getJob(int id) {
		// getting a single job bean from database
		return "job.jsp";
	}

	@RequestMapping("myjobs")
	public String myJob(int id) {
		// getting all job posted by a single customer
		return "myjobs.jsp";
	}

	@RequestMapping("jobs")
	public String allJobs() {
		// getting all jobs
		// List<Job> jobs = jobService.getAllJobs();
		// jobs=jobService.getAllJobs();
		return "jobs.jsp";
	}

	@RequestMapping("editjob")
	public String editJob(Job job) {
		return "editjob.jsp";
	}

	@RequestMapping("deletejob")
	public String deleteJob(Job job) {
		return "deletejob.jsp";
	}
}
