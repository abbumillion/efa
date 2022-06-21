package com.app.efa.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.efa.Entity.User;
import com.app.efa.Repository.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;

//	public List<User> getAllUsers() {
//		List<User> users = new ArrayList<>();
//		userRepo.findAll().forEach(users::add);
//		return users;
//	}

	public void addUser(User user) {
		userRepo.save(user);
	}

	public void updateUser(int id, User user) {
		userRepo.save(user);
	}

	//get all users from database using user repository  
	public List<User> getUsers() {
		return userRepo.findAll();
	}

	//get single user by id
	public User getUserById(Long id) {
		return userRepo.findByUserId(id);
	}

	//get user by first name
	public User getUserByFirstName(String firstName) {
		return userRepo.findByFirstName(firstName);
	}

	//get user by last name
	public User getUserByLastName(String lastName) {
		return userRepo.findByLastName(lastName);
	}

	//get user by email address
	public User getUserByEmail(String email) {
		return userRepo.findByEmail(email);
	}

	//get user by phone number
	public User getUserByPhone(String phone) {
		return userRepo.findByPhoneNumber(phone);
	}

	//list of users within the same  city
	public List<User> getUserByCity(String city) {
		return userRepo.findAll();
	}

	//list of users within the same  state
	public List<User> getUserByState(String state) {
		return userRepo.findAll();
	}

	//list of users by date
	public List<User> getUsersByDate(Date date) {
		return userRepo.findAll();
	}

	//list of users between  two dates
	public List<User> getUsersByDates(Date date1, Date date2) {
		return userRepo.findAll();
	}

}
