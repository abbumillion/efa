package com.app.efa.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.efa.Entity.Skill;

@RestController
public class SkillController {

	@RequestMapping("addskill")
	public String addSkill(Skill skill) {
		return "addskill.jsp";
	}

	@RequestMapping("getskill")
	public String getSkill(int id) {
		return "addskill.jsp";
	}

	@RequestMapping("myskills")
	public String mySkill(int id) {
		return "addskill.jsp";
	}
	
	@RequestMapping("skills")
	public String Skills() {
		return "skills.jsp";
	}
	
	@RequestMapping("editskill")
	public String editSkill(Skill skill) {
		return "editskill.jsp";
	}
	
	@RequestMapping("deleteskill")
	public String deleteSkill(Skill skill) {
		return "addskill.jsp";
	}
}
