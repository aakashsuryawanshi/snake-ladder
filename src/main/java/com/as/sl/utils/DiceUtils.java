package com.as.sl.utils;

import java.util.List;

import com.as.sl.constants.CommonConstants;
import com.as.sl.entities.Board;
import com.as.sl.entities.Game;
import com.as.sl.entities.dice.Dice;
import com.as.sl.entities.jumpers.Jumper;
import com.as.sl.entities.jumpers.Ladder;
import com.as.sl.entities.jumpers.Snake;

public class DiceUtils {

	public static int getValueAfterDiceThrow(Game game, int currentPosition) {
		Board board = Board.getInstance();
		List<Jumper> jumpers = board.getJumpers();
		Dice d = game.getDice();
		int val = d.throwDice();
		System.out.println(CommonConstants.DICE_FACE + val);
		int updatedPosition = currentPosition + val;
		if(updatedPosition > 100) {
			return currentPosition;
		}
		for(Jumper j : jumpers) {
			if(j.getStart() == updatedPosition) {
				if(j instanceof Snake) {
					System.out.println(CommonConstants.GOT_SNAKE);
				}
				if(j instanceof Ladder) {
					System.out.println(CommonConstants.GOT_LADDER);
				}
				return j.getEnd();
			}
		}
		return updatedPosition;
	}
}
