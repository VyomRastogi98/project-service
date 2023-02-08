package com.axis.projectservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalProjectHandler {
	
@ExceptionHandler(value = ProjectNotFoundException.class)
	
	public ResponseEntity<String>projectNotFoundExceptionHandler(ProjectNotFoundException ex){
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}

}
