package com.app.efa.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.efa.Entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Long> {
	// find by admin id
	//	public Admin findByAdminId(long id);

		// to find admin by first name
		public Admin findByFirstName(String firstName);

		// to find user by last name
		public Admin findByLastName(String lastName);

		// to find user by email
	//	public Admin findByEmail(String email);

		// to find user by phone number
		public Admin findByPhoneNumber(String phoneNumber);

		// to find user by date of birth
		public List<Admin> findByLevel(int level);


}
