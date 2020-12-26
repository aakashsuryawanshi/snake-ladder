package com.as.sl;

import com.as.sl.constants.CommonConstants;
import com.as.sl.entities.Game;
import com.as.sl.entities.factories.GameTypeFactory;
import com.as.sl.service.InitService;
import com.as.sl.service.PlayService;
import com.as.sl.service.impl.InitializeSerivceImpl;
import com.as.sl.utils.CommonUtils;

public class SnakeLadderApp {

	public static void main(String[] args) {
		InitService service = new InitializeSerivceImpl();
		Game g = service.initializeGame();
		System.out.println(CommonConstants.START_PLAYING);
		PlayService playService = GameTypeFactory.getPlayService(g.getType());
		playService.play(g);
		CommonUtils.findWinner(g.getPlayers());
	}
}
