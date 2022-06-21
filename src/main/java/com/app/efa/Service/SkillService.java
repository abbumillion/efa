package com.app.efa.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.efa.Entity.Skill;
import com.app.efa.Repository.SkillRepo;

@Service
public class SkillService {
	@Autowired
	private SkillRepo skillRepo;

	public List<Skill> getAllJobs() {
		List<Skill> jobs = new ArrayList<>();
		skillRepo.findAll().forEach(jobs::add);
		return jobs;
	}

	public void addSkill(Skill customer) {
		skillRepo.save(customer);
	}

	public void updateSkill(int id, Skill customer) {
		skillRepo.save(customer);
	}
}
