package com.as.sl.entities;

public class Player implements Comparable<Player>{
	String playerId;
	int sequenceNumber;
	int position;
	
	public Player(String id, int seq) {
		this.playerId = id;
		this.sequenceNumber = seq;
		this.position = 0;
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	
	
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((playerId == null) ? 0 : playerId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (playerId == null) {
			if (other.playerId != null)
				return false;
		} else if (!playerId.equals(other.playerId))
			return false;
		return true;
	}

	@Override
	public int compareTo(Player o) {
		if(o == null || o.getPlayerId() == null) {
			return -1;
		}
		return this.playerId.compareTo(o.getPlayerId());
	}
	
	
	
}
