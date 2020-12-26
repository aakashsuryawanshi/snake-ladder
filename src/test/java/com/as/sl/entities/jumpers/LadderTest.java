package com.as.sl.entities.jumpers;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.as.sl.exception.SLException;

public class LadderTest {

	
	@Test(expected=SLException.class)
	public void createLadderOutOfBound_1() {
		Ladder l = new Ladder(-1, 10);
	}
	
	@Test(expected=SLException.class)
	public void createLadderOutOfBound_2() {
		Ladder l = new Ladder(0, 1000);
	}
	
	@Test(expected=SLException.class)
	public void createLadderInvalidBound_1() {
		Ladder l = new Ladder(10, 2);
	}
	
	@Test(expected=SLException.class)
	public void createLadderInvalidBound_2() {
		Ladder l = new Ladder(10, 10);
	}
	
	@Test
	public void createLadder() {
		Ladder l = new Ladder(1, 10);
		assertNotNull(l);
	}
}
