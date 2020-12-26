package com.as.sl.entities.factories;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.as.sl.entities.dice.CrookedDice;
import com.as.sl.entities.dice.Dice;
import com.as.sl.entities.dice.NormalDice;
import com.as.sl.entities.enums.DiceType;

public class DiceFactoryTest {

	@Test
	public void testGetDice() {
		Dice d = DiceFactory.getDice(DiceType.CROOKED);
		assertTrue(d instanceof CrookedDice);
		d = DiceFactory.getDice(DiceType.NORMAL);
		assertTrue(d instanceof NormalDice);
	}
}
