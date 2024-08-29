package com.MongoDBtest.methodInterface;

import java.util.List;
import java.util.Optional;

import com.MongoDBtest.Dto.RequestStudentDto;
import com.MongoDBtest.Model.Students;

public interface ServiceMethods {

	String addStudent(RequestStudentDto requestStudentDto);
	
	List<Students> getStudents();
	
	Optional<Students> getOneProfile(int id);
	
	String updateProfile( RequestStudentDto requestStudentDto, int rollNO);
	
	
}
