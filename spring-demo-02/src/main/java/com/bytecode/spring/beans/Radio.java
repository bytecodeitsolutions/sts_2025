package com.bytecode.spring.beans;

public class Radio {

	private Frequency frequency;
	
	private String songName;

	public Radio(Frequency frequency) {
		this.frequency = frequency;
	}

	public void playSong() {
		frequency.tune();
		System.out.println("Playing song "+songName);
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}
}
