package com.monocept.model;

public class VideoPlayer implements MediaPlayer {

	@Override
	public void start() {
		System.out.println("video strated");
		
	}

	@Override
	public void stop() {
		System.out.println("video stopped");
		
	}

	

}
