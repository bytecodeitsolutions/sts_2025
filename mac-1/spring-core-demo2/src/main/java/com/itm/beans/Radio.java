package com.itm.beans;

public class Radio {
	
	private String songName;
	
	private Frequency frequency;
	
	public Radio(Frequency frequency) {
	     System.out.println("This is from 1 param constructor Radio class");
		this.frequency = frequency;
	}

	public Frequency getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency frequency) {
		System.out.println("hello I am from setter method Radio class");
		this.frequency = frequency;
	}

	public Radio() {
		System.out.println("0 param constructor from Radio");
	}
	
	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		System.out.println("setter from Radio");
		this.songName = songName;
	}

	public void playSong() {
        System.out.println("playing song  "+songName +" "+frequency.tune());
	}
}
