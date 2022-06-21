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
public class JobApplicationModel {
	// id
	private Date applicationDate;
	// applied user
	private UserModel userModel;
	// job for this job application
	private JobModel jobModel;
	// boolean if it's approved or not
	private Boolean accepted;

}
