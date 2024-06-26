package com.monocept.model;

public class PodcastPlayer implements MediaPlayer {

	@Override
	public void start() {
		System.out.println("podcast strated");
		
	}

	@Override
	public void stop() {
		System.out.println("podcast stopped");
		
	}

	

}
