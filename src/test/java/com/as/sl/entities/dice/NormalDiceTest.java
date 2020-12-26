package com.as.sl.entities.dice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NormalDiceTest {

	@Test
	public void testThrow() {
		NormalDice dice = new NormalDice();
		int v = dice.throwDice();
		assertTrue(v > 0 && v < 7);
	}
}
