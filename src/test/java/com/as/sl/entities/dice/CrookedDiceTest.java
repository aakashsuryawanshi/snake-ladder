package com.as.sl.entities.dice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CrookedDiceTest {

	@Test
	public void testThrow() {
		CrookedDice dice = new CrookedDice();
		int v = dice.throwDice();
		assertTrue(v % 2 == 0);
		assertTrue(v > 0 && v < 7);
	}
}
