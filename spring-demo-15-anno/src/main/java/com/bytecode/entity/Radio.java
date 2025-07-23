package com.bytecode.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Radio {

	@Value("${song.name}")
	private String songName;

	@Autowired
	private Frequency frequency;

	public void playMusic() {
		frequency.tune();
		System.out.println("Playing song " + songName);
	}
}
