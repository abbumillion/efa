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
public class JobModel {
	// -----------------------------------------------------//
	// ----------------job bean ---------------------------//
	// -----------------------------------------------------//
	private int numberOfVacancies;
	// required experience
	private String jobExperience;
	// job description
	private String jobDescription;
	// job title
	private String jobTitle;
	// availability required
	private String availibilty;
	// job category
	private String jobCategory;
	// posted date
	private Date startDate;
	// deadline day
	private Date endDate;
	// job budget paid
	private double jobBudget;
	// is approved
	private boolean isApproved;
	// job employer user
	private UserModel jobUserModel;
	// skill required by the job
	private List<SkillModel> requiredSkillModels;
	private List<JobApplicationModel> jobApplications;
	// ------------------------------------------------------//

}
