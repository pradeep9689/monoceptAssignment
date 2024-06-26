package com.monocept.model;

public class AudioPlayer implements MediaPlayer {

	@Override
	public void start() {
		System.out.println("Audio strated");
		
	}

	@Override
	public void stop() {
		System.out.println("Audio stopped");
		
	}

	

}
