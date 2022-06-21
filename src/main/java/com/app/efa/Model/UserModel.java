package com.app.efa.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public  class UserModel {
	// user's first name
	private String firstName;
	// user's last name
	private String lastName;
	// user's date of birth for age calculation
	private Date dateOfBirth;
	// user's gender
	private char gender;
	// user's email
	private String email;
	// user's phone number
	private String phoneNumber;
	// user registration date
	private Date registrationDate;
	// user rating given by other users
	private int userRating;
	// user profile picture
	private String profilePicture;
	private AddressModel userAddressModel;
	private List<JobModel> userJobModels;
	// one user can apply to many jobs
	private List<JobApplicationModel> userJobApplications;
	// one user has many skills
	private List<SkillModel> userSkillModels;
	private List<FeedbackModel> userFeedbacks;

}
