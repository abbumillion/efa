package com.app.efa.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.efa.Entity.User;

//
//user DAO for interacting with database 
//
@Repository
public interface UserRepo extends JpaRepository<User, Long> {
	// find by id
	public User findByUserId(long id);

	// to find user by first name
	public User findByFirstName(String firstName);

	// to find user by last name
	public User findByLastName(String lastName);

	// to find user by email
	public User findByEmail(String email);

	// to find user by phone number
	public User findByPhoneNumber(String phoneNumber);

	// to find user by date of birth
	public List<User> findByDateOfBirth(Date dateOfBirth);

	// to find users by city
	//public List<User> findByCity(String city);

	// to find users within the same state
	//public List<User> findByState(String state);
//	public User findByDateOfBirth(Date dateOfBirth);
	// find all job posted by one specific user
	// find all job application applied by one specific user
	//find all feedback made by one specific user
	//

}
