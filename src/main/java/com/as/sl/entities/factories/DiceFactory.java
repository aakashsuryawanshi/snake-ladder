package com.as.sl.entities.factories;

import com.as.sl.entities.dice.CrookedDice;
import com.as.sl.entities.dice.Dice;
import com.as.sl.entities.dice.NormalDice;
import com.as.sl.entities.enums.DiceType;
import com.as.sl.exception.SLException;

public class DiceFactory {

	public static Dice getDice(DiceType type) {
		if(type == DiceType.NORMAL) {
			return new NormalDice();
		}
		if(type == DiceType.CROOKED) {
			return new CrookedDice();
		}
		throw new SLException("Invalid Dice", "Dice Not Supported");
	}
}
