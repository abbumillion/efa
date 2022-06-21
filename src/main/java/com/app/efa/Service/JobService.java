package com.app.efa.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.efa.Entity.Job;
import com.app.efa.Repository.JobRepo;

@Service
public class JobService {

	private JobRepo jobRepo;

	public List<Job> getMyJobs(int id) {
		List<Job> jobs = new ArrayList<>();
		// jobRepo.findAllById(id).forEach(jobs::add);
		return jobs;
	}

	public List<Job> getAllJobs() {
		List<Job> jobs = new ArrayList<>();
		jobRepo.findAll().forEach(jobs::add);
		return jobs;
	}

	public void addJob(Job customer) {
		jobRepo.save(customer);
	}

	public void updateJob(int id, Job customer) {
		jobRepo.save(customer);
	}

	public void deleteJob(Job job) {
		jobRepo.delete(job);
	}

	public void deleteJob(Long id) {
		jobRepo.deleteById(id);
	}

	public void deleteAllJobs() {
		jobRepo.deleteAll();
	}

}
