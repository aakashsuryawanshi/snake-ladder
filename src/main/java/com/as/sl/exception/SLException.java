package com.as.sl.exception;

public class SLException extends RuntimeException{
	
	public SLException(String name, String msg) {
		super(name);
		System.out.println(name + " : " + msg);
	}
}
