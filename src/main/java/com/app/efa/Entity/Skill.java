package com.app.efa.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Skill {
//-------SKILL BEAN------------//

	// skill id as a primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long skillId;

	// skill name or title like developer,designer
	@Column(nullable = false, unique = false, length = 30)
	private String skillName;

	// skill description
	@Column(nullable = false, unique = false, length = 100)
	private String skillInformation;

	// skill category like technology,art,medical
	@Column(nullable = false, unique = false, length = 30)
	private String skillCategory;

	// foreign relationship
	@ManyToOne
	private User user;
//-----------------------------//

}
