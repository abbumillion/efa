package com.app.efa.Entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Job {
	// -----------------------------------------------------//
	// ----------------job bean ---------------------------//
	// -----------------------------------------------------//
	// id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long jobId;
	// number of vacancy for the job
	@Column(nullable = false, unique = false, length = 10)
	private int numberOfVacancies;
	// required experience
	@Column(nullable = false, unique = false, length = 20)
	private String jobExperience;
	// job description
	@Column(nullable = false, unique = false, length = 100)
	private String jobDescription;
	// job title
	@Column(nullable = false, unique = false, length = 30)
	private String jobTitle;
	// availability required
	@Column(nullable = false, unique = false, length = 20)
	private String availibilty;
	// job category
	@Column(nullable = false, unique = false, length = 20)
	private String jobCategory;
	// posted date
	@Column(nullable = false, unique = false, length = 20)
	private Date startDate;
	// deadline day
	@Column(nullable = false, unique = false, length = 20)
	private Date endDate;
	// job budget paid
	@Column(nullable = false, unique = false, length = 20)
	private double jobBudget;
	// is approved
	@Column(nullable = false, unique = false, length = 20)
	private boolean isApproved;
	// job employer user
	@ManyToOne
	private User jobUser;
	// skill required by the job
	@OneToMany
	private List<Skill> requiredSkills;
	@OneToMany
	private List<JobApplication> jobApplications;
	// ------------------------------------------------------//

}
