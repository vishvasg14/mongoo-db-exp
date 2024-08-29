package com.MongoDBtest.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MongoDBtest.methodInterface.*;
import com.MongoDBtest.Dto.RequestStudentDto;
import com.MongoDBtest.Model.Students;
import com.MongoDBtest.Repoitory.StudentsRepository;

@Service
public class MongoDBService implements ServiceMethods {

	@Autowired
	private StudentsRepository studentsRepository;

	public String addStudent(RequestStudentDto requestStudentDto) {
		Students s = new Students();
		s.setName(requestStudentDto.getName());
		s.setAddress(requestStudentDto.getAddress());
		s.setRoll_no(requestStudentDto.getRoll_no());
		s.setCourse(requestStudentDto.getCourse());
		s.setUniversity(requestStudentDto.getUniversity());
		s.setDescription(requestStudentDto.getDescription());
		s.setAge(requestStudentDto.getAge());
		studentsRepository.save(s);
		return "Data added to DB!!";
	}

	public List<Students> getStudents() {
		List<Students> stdts = studentsRepository.findAll();
		return stdts;
	}

	public Optional<Students> getOneProfile(int id) {
		Optional<Students> s = studentsRepository.findById(id);
		return s;
	}

	@Override
	public String updateProfile(RequestStudentDto requestStudentDto, int rollNO) {
		int student_roll_no = requestStudentDto.getRoll_no();
		if (rollNO != student_roll_no) {
			return "Roll number mismatch";
		}
		Optional<Students> optionalStudent = studentsRepository.findById(rollNO);
	    
	    if (optionalStudent.isPresent()) {
	        Students student = optionalStudent.get();

	        student.setName(requestStudentDto.getName());
	        student.setCourse(requestStudentDto.getCourse());
	        student.setRoll_no(requestStudentDto.getRoll_no());
	        student.setCourse(requestStudentDto.getCourse());
	        student.setUniversity(requestStudentDto.getUniversity());
	        student.setAddress(requestStudentDto.getAddress());
	        student.setAge(requestStudentDto.getAge());

	        studentsRepository.save(student);
	        
	        return "Profile updated successfully";
	    } else {
	        return "Student not found";
	    }
	}
}
