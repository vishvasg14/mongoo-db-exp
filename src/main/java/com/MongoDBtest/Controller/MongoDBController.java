package com.MongoDBtest.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MongoDBtest.Dto.RequestStudentDto;
import com.MongoDBtest.Model.Students;
import com.MongoDBtest.Service.MongoDBService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@SecurityRequirement(name = "auth")
@RequestMapping("/home")
public class MongoDBController {

	@Autowired
	private MongoDBService mongoDBService; 
	
	@PostMapping("/add")
	public String addStudent(@RequestBody RequestStudentDto requestStudentDto) {
		return mongoDBService.addStudent(requestStudentDto);
	}
	
	@GetMapping("/get")
	public List<Students> getAllStudents() {
		return mongoDBService.getStudents();
	}
	
	@GetMapping("/get/{rollNO}")
	public Optional<Students> getStudent(@PathVariable int rollNO) {
		return mongoDBService.getOneProfile(rollNO);
	}
	
	@PutMapping("/update/{rollNO}")
	public String updateProfile(@RequestBody RequestStudentDto requestStudentDto, @PathVariable int rollNO) {
		return mongoDBService.updateProfile(requestStudentDto, rollNO);
	}
}
