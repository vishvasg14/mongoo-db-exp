package com.MongoDBtest.Dto;

public class RequestStudentDto {

	private Integer roll_no;
	private String name;
	private String address;

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

	public RequestStudentDto(Integer roll_no, String name, String address) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.address = address;
	}

	public RequestStudentDto() {
		super();
	}

}
