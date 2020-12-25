package com.as.sl.entities;

import java.util.ArrayList;
import java.util.List;

import com.as.sl.entities.dice.Dice;
import com.as.sl.entities.enums.DiceType;
import com.as.sl.entities.factories.DiceFactory;

public class Game {
	String gameId;
	Board board;
	List<Player> players;
	Dice dice;
	public Game(String gameId, DiceType type) {
		this.gameId = gameId;
		board = Board.getInstance();
		players = new ArrayList<Player>();
		dice = DiceFactory.getDice(type);
	}
	
	public void addPlayer(String name) {
		players.add(new Player(name));
	}
}
