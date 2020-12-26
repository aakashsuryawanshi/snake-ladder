package com.as.sl.entities.jumpers;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.as.sl.exception.SLException;

public class SnakeTest {

	
	@Test(expected=SLException.class)
	public void createSnakeOutOfBound_1() {
		Snake l = new Snake(-1, 10);
	}
	
	@Test(expected=SLException.class)
	public void createSnakeOutOfBound_2() {
		Snake l = new Snake(0, 1000);
	}
	
	@Test(expected=SLException.class)
	public void createSnakeInvalidBound_1() {
		Snake l = new Snake(2, 12);
	}
	
	@Test(expected=SLException.class)
	public void createSnakeInvalidBound_2() {
		Snake l = new Snake(10, 10);
	}
	
	@Test
	public void createSnake() {
		Snake l = new Snake(10, 1);
		assertNotNull(l);
	}
}
