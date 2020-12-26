package com.as.sl.entities.jumpers;

import com.as.sl.constants.ExceptionConstants;
import com.as.sl.exception.SLException;

public class Ladder extends Jumper{

	public Ladder(int start, int end) {
		if(start < 1 || start > 100 || end < 1 || end > 100) {
			throw new SLException(ExceptionConstants.INVALID_LADDER, ExceptionConstants.OUT_OF_BOUND);
		}
		if(start == end) {
			throw new SLException(ExceptionConstants.INVALID_LADDER, ExceptionConstants.SAME_POINTS);
		}
		if(start > end) {
			throw new SLException(ExceptionConstants.INVALID_LADDER, ExceptionConstants.START_IS_GREATER);
		}
		this.start = start;
		this.end = end;
	}
}
