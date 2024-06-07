package com.monocept.model;

public class Video implements Playable{

	private String title;
	  private String resolution;

	public Video(String title, String resolution) {
		
		this.title = title;
		this.resolution = resolution;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing Video: " + title + " (" + resolution + ")");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Pausing Video: " + title);
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stopping Video: " + title);
	}

}

