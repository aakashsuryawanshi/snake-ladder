package com.as.sl.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.as.sl.constants.CommonConstants;
import com.as.sl.constants.ExceptionConstants;
import com.as.sl.entities.Board;
import com.as.sl.entities.Game;
import com.as.sl.entities.enums.DiceType;
import com.as.sl.entities.enums.GameType;
import com.as.sl.exception.SLException;
import com.as.sl.service.GameInitService;
import com.as.sl.utils.CommonUtils;


public class SimpleGameInitSerivceImpl implements GameInitService{

	private CommonUtils utils;
	
	public SimpleGameInitSerivceImpl() {
		utils = CommonUtils.getInstance();
	}
	
	@Override 
	public Game initializeGame() {
		try {
			System.out.println(CommonConstants.FIRST_MSG);
			String gameId = System.currentTimeMillis() + "";
			System.out.println(CommonConstants.GAME_TYPE);
			GameType gType = CommonUtils.getGameTypeFromInput(utils.readLine());
			System.out.println(CommonConstants.TYPE_OF_DICE);
			DiceType dType = CommonUtils.getDiceTypeFromInput(utils.readLine());
			System.out.println(CommonConstants.NUM_OF_TURNS);
			Game game = new Game(gameId, gType, dType); 
			game.setNumOfTurns(Integer.parseInt(utils.readLine()));
			if(gType == GameType.MULTI_PLAYER) {
				System.out.println(CommonConstants.NO_OF_PLAYERS);
				int num = Integer.parseInt(utils.readLine());
				game.setNumOfPlayer(num);
				initializePlayers(game, num);
			}
			else { 
				initializePlayers(game, 1);
				game.setNumOfPlayer(2);
				game.addPlayer(CommonConstants.SYSTEM, 1);
			}
			initializeBoard();
			System.out.println(CommonConstants.GAME_INITIALIZED);
			game.getBoard().printBoard();
			return game;
		}
		catch(Exception e) {
			throw new SLException(ExceptionConstants.INVALID_INPUT, e.getMessage());
		}
	}
	
	public void initializePlayers(Game game, int playercount) throws Exception{
		for(int i=0; i<playercount; i++) {
			System.out.println(CommonConstants.NAME_OF_PLAYER);
			try {
				String name =  utils.readLine();
				if(name.equalsIgnoreCase(CommonConstants.SYSTEM)) {
					System.out.println(CommonConstants.PLAYER_INVALID);
					i--;
				}
				else {
					game.addPlayer(name, i);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println(CommonConstants.PLAYER_ALREADY_EXIST);
				i--;
			}
		}
	}
	
	public void initializeBoard() {
		Board board = Board.getInstance();
		board.addSanke(51, 11);
		board.addSanke(56, 15);
		board.addSanke(62, 57);
		board.addSanke(92, 53);
		board.addSanke(98, 8);
		board.addLadder(2, 38);
		board.addLadder(4, 14);
		board.addLadder(9, 31);
		board.addLadder(33, 85);
		board.addLadder(52, 88);
		board.addLadder(80, 99);
	}

}
