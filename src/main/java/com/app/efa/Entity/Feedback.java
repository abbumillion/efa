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
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long FeedbackId;
	// user's feedback
	@Column(nullable = false, unique = false, length = 30)
	private String content;
	// feedback date
	@Column(nullable = false, unique = false, length = 30)
	private Date date;
	// many feedback by one user
	@ManyToOne
	private User user;
}
