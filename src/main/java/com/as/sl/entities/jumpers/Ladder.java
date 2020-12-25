package com.as.sl.entities.jumpers;

import com.as.sl.exception.SLException;

public class Ladder extends Jumper{

	public Ladder(int start, int end) {
		if(start > end) {
			throw new SLException("Invalid Ladder", "Invalid end points");
		}
		this.start = start;
		this.end = end;
	}
}
