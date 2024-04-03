package com.HAH.mapping.model.dto;

import java.util.Objects;

import lombok.Data;

@Data
public class Course {

	private int id;
	private String name;
	private int duration;
	private JavaCourseLevel level;
	private int fees;

	public Course() {
	}

	public Course(String name, int duration, JavaCourseLevel level, int fees) {
		super();
		this.name = name;
		this.duration = duration;
		this.level = level;
		this.fees = fees;
	}

}
