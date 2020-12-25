package com.as.sl.entities;

import java.util.ArrayList;
import java.util.List;

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
	
	
}
