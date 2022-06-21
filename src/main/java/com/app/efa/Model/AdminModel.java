package com.app.efa.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminModel {
	//user's first name
	private String firstName;
	//user's last name
	private String lastName;
	//user's date of birth for age calculation
	private Date dateOfBirth;
	//user's gender
	private char Gender;
	//user's email
	private String Email;
	//user's phone number 
	private String phoneNumber;
	//string password
	private String password;
	//string re password
	private String re_password;
	//user registration date
	private Date registrationDate;
	private AddressModel userAddressModel;
	int level;



}