package com.as.sl.entities.factories;

import com.as.sl.constants.ExceptionConstants;
import com.as.sl.entities.dice.CrookedDice;
import com.as.sl.entities.dice.Dice;
import com.as.sl.entities.dice.NormalDice;
import com.as.sl.entities.enums.DiceType;
import com.as.sl.entities.enums.GameType;
import com.as.sl.exception.SLException;
import com.as.sl.service.PlayService;
import com.as.sl.service.impl.MultiPlayServiceImpl;
import com.as.sl.service.impl.SinglePlayImpl;

public class GameTypeFactory {
	public static PlayService getPlayService(GameType type) {
		if(type == GameType.SINGLE_PLAYER) {
			return new SinglePlayImpl();
		}
		if(type == GameType.MULTI_PLAYER) {
			return new MultiPlayServiceImpl();
		}
		throw new SLException(ExceptionConstants.INVALID_GAME_TYPE, ExceptionConstants.GAME_TYPE_NOT_SUPPORTED);
	}
}
