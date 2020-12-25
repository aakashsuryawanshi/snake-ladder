package com.as.sl.entities.dice;

import java.util.Random;

public class NormalDice implements Dice{

	@Override
	public int throwDice() {
        Random random = new Random(); 
        int num = random.nextInt(6);
        num = num + 1;
		return num;
	}

}
