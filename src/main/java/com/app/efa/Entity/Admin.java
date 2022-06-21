package com.app.efa.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Admin {
	//user's id for primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long AdminId;
	//user's first name
	@Column(nullable=false,unique=false,length=30)
	private String firstName;
	//user's last name
	@Column(nullable=false,unique=false,length=30)
	private String lastName;
	//user's date of birth for age calculation
	@Column(nullable=false,unique=false,length=30)
	private Date dateOfBirth;
	//user's gender
	@Column(nullable=false,unique=false,length=3)
	private char Gender;
	//user's email
	@Column(nullable=false,unique=true,length=30)
	private String Email;
	//user's phone number 
	@Column(nullable=false,unique=true,length=20)
	private String phoneNumber;
	//user registration date
	@Column(nullable=false,unique=false,length=20)
	private Date registrationDate;
	@Embedded
	private Address userAddress;
	@Column(nullable = false, unique = false, length = 10)
	int level;



}
