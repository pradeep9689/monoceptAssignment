package com.monocept.model;

public interface MediaPlayer {
	void start();
	void stop();
	static void supportedFiles()
	{
		System.out.println("mp3,mp4,mpeg");
	}

}
