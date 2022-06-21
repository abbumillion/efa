package com.app.efa.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JobApplication {
	// id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long jobApplicationId;
	// application date
	@Column(nullable = false, unique = false, length = 20)
	private Date applicationDate;
	// applied user
	@ManyToOne
	private User user;
	// job for this job application
	@ManyToOne
	private Job job;
	// boolean if it's approved or not
	@Column(nullable = true, unique = false, length = 10)
	private Boolean accepted;

}
