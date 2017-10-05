package com.example.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseModel {
	private String idCourse;
	private String name;
	private Integer credits;
	private List<StudentModel> students;
	
	public CourseModel(String idCourse, String name, Integer credits, List<StudentModel> students) {
		this.idCourse = idCourse;
		this.name = name;
		this.credits = credits;
		this.students = students;
	}
	
	public CourseModel(String idCourse, String name, Integer credits) {
		this.idCourse = idCourse;
		this.name = name;
		this.credits = credits;
	}

	public String getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(String idCourse) {
		this.idCourse = idCourse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public List<StudentModel> getStudents() {
		return students;
	}

	public void setStudents(List<StudentModel> students) {
		this.students = students;
	}
	
	
}