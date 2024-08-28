package com.MongoDBtest.Dto;

public class RequestStudentDto {

	private Integer roll_no;
	private String name;
	private String address;
	private String course;
	private String university;
	private String description;
	private int age;

	public Integer getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(Integer roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public RequestStudentDto(Integer roll_no, String name, String address, String course, String university,
			String description, int age) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.address = address;
		this.course = course;
		this.university = university;
		this.description = description;
		this.age = age;
	}

	public RequestStudentDto() {
		super();
	}

}
