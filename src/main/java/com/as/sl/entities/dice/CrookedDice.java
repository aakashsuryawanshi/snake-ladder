package com.as.sl.entities.dice;

import java.util.Random;

public class CrookedDice implements Dice{

	@Override
	public int throwDice() {
        Random random = new Random(); 
        int num = random.nextInt(6);
        num = num + 1;
        num = num * 2;
        num = num % 7;
        if(num == 1) {
        	return 2;
        }
		return num;
	}

}
