package com.app.efa.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.efa.Entity.JobApplication;
import com.app.efa.Repository.JobApplicationRepo;

@Service
public class JobApplicationService {

	@Autowired
	private JobApplicationRepo jobApplicationRepo;

	public List<JobApplication> getMyJobApplications(int id) {
		List<JobApplication> jobs = new ArrayList<>();
		//JobApplicationRepo.findAll(id).forEach(jobs::add);
		return jobs;
	}

	public List<JobApplication> getAllJobs() {
		List<JobApplication> jobs = new ArrayList<>();
		jobApplicationRepo.findAll().forEach(jobs::add);
		return jobs;
	}

	public void addJob(JobApplication customer) {
		jobApplicationRepo.save(customer);
	}

	public void updateJob(int id, JobApplication customer) {
		jobApplicationRepo.save(customer);
	}

	public void deleteJob(JobApplication job) {
		jobApplicationRepo.delete(job);
	}

	public void deleteJob(Long id) {
		jobApplicationRepo.deleteById(id);
	}

	public void deleteAllJobs() {
		jobApplicationRepo.deleteAll();
	}

}
