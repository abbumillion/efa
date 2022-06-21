package com.app.efa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.efa.Entity.Skill;


@Repository
public interface SkillRepo extends JpaRepository<Skill,Long>{

//	public User findById(long id);
//	// to find user by first name
//	public User findByFirstName(String firstName);
//
//	// to find user by last name
//	public User findByLastName(String lastName);
//
//	// to find user by email
//	public User findByEmail(String email);
//
//	// to find user by phone number
//	public User findByPhoneNumber(String phoneNumber);
//
//	// to find user by date of birth
//	public List<User> findByDateOfBirth(Date dateOfBirth);
//
//	// to find users by city
//	public List<User> findByCity(String city);
//
//	// to find users within the same state
//	public List<User> findByState(String state);
////	public User findByDateOfBirth(Date dateOfBirth);

}
