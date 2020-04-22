package com.luv2code.springdemo.mvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
implements ConstraintValidator<CourseCode, String> {
	public String coursePrefix;
	@Override
	public void initialize(CourseCode arg0) {
		coursePrefix = arg0.value();
	}
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		boolean resultant;
		if (arg0 != null)
			resultant = arg0.startsWith(coursePrefix);
		else
			resultant = false;
		return(resultant);
	}
}