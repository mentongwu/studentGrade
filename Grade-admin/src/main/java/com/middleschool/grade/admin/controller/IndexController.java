package com.middleschool.grade.admin.controller;

import com.middleschool.grade.common.dto.MgStudent;
import com.middleschool.grade.common.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {
	@Autowired
	private TestService testService;
	/**
	 * @Title	showIndex
	 * @Description show index
	 * @param	@return
	 * @return	String
	 * @throws
	 */
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
	
	@RequestMapping("/menu/{module}/{page}")
	public String showPage(@PathVariable String module, @PathVariable String page){
		return module+"/"+page;
	}

	@RequestMapping("/test")
	public String test(){
		MgStudent student=new MgStudent();
		student.setName("hhh");
		student.setStudentNum(20122213259L);
		testService.saveTest(student);
		return "success";
	}
	
	
}
