package com.codingdojo.models;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;







public class Gold {

	
	private int gold=0;
	private ArrayList<String> log=new ArrayList<String>();
	
	
	
	
	
	
	public ArrayList<String> getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log.add(log);
		
	}

	private int random;
	
	
	
	
	
	public Gold() {
		
			
		
		
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public void AddGold(int min, int max) {
	
		
		Random randinstance = new Random();
		
		
		
		this.random=randinstance.nextInt((min+1))+min;
					
		this.gold+=this.random;

		

		
		
		
		
		
		
		

		
		
		
		
		
		
		
	}
	
	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	public void casinoGold(int min, int max) {
		
		Random randinstance = new Random();
		
		
		
		this.random=randinstance.nextInt((max*2))-max;
					
		this.gold+=this.random;
	
		
		
		
		
		
		
	}


	
}
