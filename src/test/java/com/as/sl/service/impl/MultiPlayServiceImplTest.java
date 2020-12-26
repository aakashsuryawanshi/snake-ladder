package com.as.sl.service.impl;

import org.junit.Test;

import com.as.sl.entities.Game;
import com.as.sl.entities.enums.DiceType;
import com.as.sl.entities.enums.GameType;
import com.as.sl.entities.factories.DiceFactory;

public class MultiPlayServiceImplTest {

	@Test
	public void testPlay() {
		Game g = new Game("NA", GameType.MULTI_PLAYER, DiceType.NORMAL);
		g.addPlayer("Akash", 0);
		g.addPlayer("Abhi", 0);
		g.setDice(DiceFactory.getDice(DiceType.CROOKED));
		g.setNumOfPlayer(2);
		g.setNumOfTurns(5);
		MultiPlayServiceImpl service = new MultiPlayServiceImpl();
		service.play(g);
		
	}
}
