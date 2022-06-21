package com.app.efa.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.efa.Entity.Admin;
import com.app.efa.Repository.AdminRepo;

@Service
public class AdminService {
	@Autowired
	private AdminRepo adminRepo;
//
	// services
	// user service to get user services
	@Autowired
	private UserService userService;
	// job service
	@Autowired
	private JobService jobService;
	// skill service
	@Autowired
	private SkillService skillService;
	// job application service
	@Autowired
	private JobApplicationService jobApplicationService;

	// admin services
	@Autowired
	public List<Admin> getAllAdmins() {
		List<Admin> admins = new ArrayList<>();
		adminRepo.findAll().forEach(admins::add);
		return admins;
	}

//
	public void addAdmin(Admin admin) {
		adminRepo.save(admin);
	}

//
	public void updateAdmin(int id, Admin admin) {
		adminRepo.save(admin);
	}
//
//	public Admin getAdmin(Long id) {
//		return adminRepo.findByAdminId(id);
//	}

//
	public Admin getAdminByFirstName(String firstName) {
		return adminRepo.findByFirstName(firstName);
	}

//
	public Admin getAdminByLastName(String lastName) {
		return adminRepo.findByLastName(lastName);
	}

////
//	public Admin getAdminByEmail(String email) {
//		return adminRepo.findByEmail(email);
//	}
//
	public void deleteAdmin(Long id) {
		adminRepo.deleteById(id);
	}
}
