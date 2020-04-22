package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	@NotNull(message="is required.")
	@Size(message="is required", min=1)
	private String first;
	@NotNull(message="is required.")
	@Size(message="is required", min=1)
	private String last;
	@Min(value=0, message="must be greater than or equal to zero.")
	@Max(value=10, message="must be less than or equal to ten.")
	@NotNull(message="is required.")
	private Integer passes;
	@NotNull(message="is required.")
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postal;
	@CourseCode(value="LUV", message="must start with LUV")
	private String courseCode;
	public String getFirst() {
		return first;
	}
	public String getLast() {
		return last;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public Integer getPasses() {
		return passes;
	}
	public void setPasses(Integer passes) {
		this.passes = passes;
	}
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}