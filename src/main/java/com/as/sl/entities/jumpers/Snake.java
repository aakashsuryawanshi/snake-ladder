package com.as.sl.entities;

import com.as.sl.exception.SLException;

public class Snake extends Jumper{

	public Snake(int start, int end) {
		if(start < end) {
			throw new SLException("Invalid Snake", "Invalid end points");
		}
		this.start = start;
		this.end = end;
	}
	
}
