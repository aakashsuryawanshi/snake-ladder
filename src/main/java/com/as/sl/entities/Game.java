package com.as.sl.entities;

import java.util.ArrayList;
import java.util.List;

public class Game {
	String gameId;
	Board board;
	List<Player> players;
	
	public Game(String gameId) {
		board = Board.getInstance();
		players = new ArrayList<Player>();
	}
	
	public void addPlayer(String name) {
		players.add(new Player(name));
	}
}
