package com.te.assingments.students;

public class IdNotFound extends RuntimeException{

	String msg ;

	public IdNotFound(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return this.msg;
	}
	
}

