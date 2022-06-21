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
public class FeedbackModel {

	private String content;
	// feedback date
	private Date date;
	// many feedback by one user
	private UserModel userModel;
}
