package com.app.efa.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public  class User {
	// user's id for primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	// user's first name
	@Column(nullable = false, unique = false, length = 30)
	private String firstName;
	// user's last name
	@Column(nullable = false, unique = false, length = 30)
	private String lastName;
	// user's date of birth for age calculation
	@Column(nullable = false, unique = false, length = 30)
	private Date dateOfBirth;
	// user's gender
	@Column(nullable = false, unique = false, length = 3)
	private char gender;
	// user's email
	@Column(nullable = false, unique = true, length = 30)
	private String email;
	// user's phone number
	@Column(nullable = false, unique = true, length = 20)
	private String phoneNumber;
	// user registration date
	@Column(nullable = false, unique = false, length = 30)
	private Date registrationDate;
	// user rating given by other users
	@Column(nullable = true, unique = false, length = 2)
	private int userRating;
	// user profile picture
	@Column(nullable = true, unique = false, length = 40)
	private String profilePicture;
	@Embedded
	private Address userAddress;
	@OneToMany
	private List<Job> userJobs;
	// one user can apply to many jobs
	@OneToMany
	private List<JobApplication> userJobApplications;
	// one user has many skills
	@OneToMany
	private List<Skill> userSkills;
	@OneToMany
	private List<Feedback> userFeedbacks;

}
