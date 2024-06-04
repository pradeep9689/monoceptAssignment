package com.monocept.model;

public class Audio extends Playable{
	private String title;
	public Audio(String title) {
		
		this.title = title;
	}

	@Override
	public void play() {
		 System.out.println("Playing Audio: " + title);
		
		
	}

	@Override
	public void pause() {
		System.out.println("Pausing Audio: " + title);
		
	}

	@Override
	public void stop() {
		System.out.println("Stopping Audio: " + title);
		
		
	}

}
