package com.as.sl.entities.dice;

import java.util.Random;

public class CrookedDice implements Dice{

	@Override
	public int throwDice() {
		Random rand = new Random(); 
		int num = 2+rand.nextInt((8-2)/2) *2;
		return num;
	}

}
