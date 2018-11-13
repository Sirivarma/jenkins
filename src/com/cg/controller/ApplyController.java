package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.Application;

import com.cg.entities.ProgramsScheduled;
import com.cg.service.ApplyService;

@Controller
public class ApplyController {
	@Autowired
	ApplyService service;

	public ApplyService getService() {
		return service;
	}

	public void setService(ApplyService service) {
		this.service = service;
	}
	
	@RequestMapping("showCoursePage")
	public String viewCourse(Model model){
	List<ProgramsScheduled> courselist= service.getAllPrograms();
	model.addAttribute("list",courselist);
	return "ViewCourseList";
	}	
	
	@RequestMapping("applyCourse")
	public String applyInCourse(Model model){
		Application a1=new Application();
		model.addAttribute("apply", a1);
		return "ApplyForm";
		
	}
	@RequestMapping("applyAction")
	public String addApplicant(Model model,@ModelAttribute("apply") Application a1){
		service.addApplicant(a1);
		return "Success";
	}
}
