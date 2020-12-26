package com.as.sl.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import com.as.sl.constants.CommonConstants;
import com.as.sl.entities.Board;
import com.as.sl.entities.Player;
import com.as.sl.entities.enums.DiceType;
import com.as.sl.entities.enums.GameType;
import com.as.sl.entities.jumpers.Jumper;

public class CommonUtils {
    //Enter data using BufferReader 
    BufferedReader reader; 
    private static CommonUtils instance;
    
    private CommonUtils() {
    	reader =  new BufferedReader(new InputStreamReader(System.in)); 
    }
    
	public static CommonUtils getInstance() {
		if(instance == null) {
			synchronized(Board.class) {
				if(instance == null)
					instance = new CommonUtils();
			}
		}
		return instance;
	}
	
	public String readLine() throws IOException {
		String a = reader.readLine();
		//System.out.println("Reading value: " + a);
		return a;
	}
	
	public static GameType getGameTypeFromInput(String input) {
		if(input.equals("1")) {
			return GameType.SINGLE_PLAYER;
		}
		else {
			return GameType.MULTI_PLAYER;
		}
	}
	
	public static DiceType getDiceTypeFromInput(String input) {
		if(input.equals("1")) {
			return DiceType.NORMAL;
		}
		else {
			return DiceType.CROOKED;
		}
	}
	
	public static boolean isPlayerExist(List<Player> players, String name) {
		for(Player p : players) {
			if(p.getPlayerId().equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}

	public static void findWinner(TreeSet<Player> players) {
		int highestPosition = 0;
		String names = "";
		for(Player player: players) {
			if(player.getPosition() >= highestPosition) {
				highestPosition = player.getPosition();
			}
		}
		for(Player player: players) {
			if(player.getPosition() == highestPosition) { 
				names += player.getPlayerId() + " ";
			}
		}
		System.out.println(CommonConstants.WINNER_IS + names);
	}
}
