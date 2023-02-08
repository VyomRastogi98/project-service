package com.axis.projectservice.exception;

public class ProjectNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = -465328L;

	public ProjectNotFoundException() {
		super();
		
	}

	public ProjectNotFoundException(String message) {
		super(message);
		
	}
	

}
