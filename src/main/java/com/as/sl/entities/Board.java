package com.as.sl.entities;

import java.util.ArrayList;
import java.util.List;

import com.as.sl.constants.CommonConstants;
import com.as.sl.constants.ExceptionConstants;
import com.as.sl.entities.jumpers.Jumper;
import com.as.sl.entities.jumpers.Ladder;
import com.as.sl.entities.jumpers.Snake;
import com.as.sl.exception.SLException;

public class Board {

	List<Jumper> jumpers;
	private volatile static Board instance = null;
	
	private Board(){
		jumpers = new ArrayList<Jumper>();
	}
	
	public static Board getInstance() {
		if(instance == null) {
			synchronized(Board.class) {
				if(instance == null)
					instance = new Board();
			}
		}
		return instance;
	}
	
	public void addSnake(int start, int end) {
		if(!isJumperValid(start, end)) {
			throw new SLException(ExceptionConstants.INVALID_SNAKE, ExceptionConstants.POSITION_INVALID);
		}
		jumpers.add(new Snake(start, end));
	}
	
	public void addLadder(int start, int end) {
		if(!isJumperValid(start, end)) {
			throw new SLException(ExceptionConstants.INVALID_LADDER, ExceptionConstants.POSITION_INVALID);
		}
		jumpers.add(new Ladder(start, end));
	}
	
	public void printBoard() {
		Board b = Board.getInstance();
		System.out.println(CommonConstants.SNAKES_ARE);
		for(Jumper a : jumpers) {
			if(a instanceof Snake) {
				System.out.println(CommonConstants.START + a.getStart() + " " + CommonConstants.END + a.getEnd());
			}
		}
		System.out.println(CommonConstants.LADDERS_ARE);
		for(Jumper a : jumpers) {
			if(a instanceof Ladder) {
				System.out.println(CommonConstants.START + a.getStart() + " " + CommonConstants.END + a.getEnd());
			}
		}
		System.out.println("\n\n");
	}
	
	public boolean isJumperValid(int start, int end) {
		for(Jumper a : jumpers) {
			if(a.getStart() == start || a.getEnd() == end) {
				System.out.println("Conflict "  + CommonConstants.START + a.getStart() + " " + CommonConstants.END + a.getEnd());
				return false;
			}
		}
		return true;
	}
	
	public List<Jumper> getJumpers(){
		return jumpers;
	}
}
