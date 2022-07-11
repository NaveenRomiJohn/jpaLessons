package com.chainsys.jpa.application.student;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentMarksController {
	@Autowired
    private StudentMarksRepository studentrepo;
	
	@RequestMapping("/getStudentMarks")
    public String getStudentMarks(@RequestParam int id) {
		studentrepo.findById(id);
		return "index.jsp";
		//        return studentrepo.findById(id);
    }
	@DeleteMapping("/deletestudent")
	public String deleteStudent(int id) {
		studentrepo.deleteById(id);
		return "redirect:/getallstudentmarks";
	}
	@PostMapping(value = "/newstudent", consumes = "application/json" )
	public String addStudent(@RequestBody StudentMarks sm)
	{
		studentrepo.save(sm);
		return "redirect:/getallstudentmarks";
	}
	@PostMapping(value = "/modifystudent", consumes = "application/json" )
	public String modifyStudent(@RequestBody StudentMarks sm)
	{
		studentrepo.save(sm);
		return "redirect:/getallstudentmarks";
	}
	@GetMapping("/getallstudentmarks")
	public List<StudentMarks> getAllMarks(){
		return studentrepo.findAll();
	}   
}