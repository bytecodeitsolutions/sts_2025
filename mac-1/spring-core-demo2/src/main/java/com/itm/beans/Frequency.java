package com.itm.beans;

public class Frequency {
	
	private float  freqNumber;
	
	public Frequency() {
        System.out.println("0 param constructor from Frequency");
	}
	
	public float getFreqNumber() {
		return freqNumber;
	}

	public void setFreqNumber(float freqNumber) {
		System.out.println("setter from Frequency");
		this.freqNumber = freqNumber;
	}

	public String tune() {
		return "at RED FM "+freqNumber;
	}
}
