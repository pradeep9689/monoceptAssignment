package com.monocept.test;

import com.monocept.model.Audio;
import com.monocept.model.Playable;
import com.monocept.model.Video;

public class PlayableTest {

	public static void main(String[] args) {
		Playable audio = new Audio("War Movie Song");
	    Playable video = new Video("KGF", "720p");

	    audio.play();  
	    audio.pause(); 
	    audio.stop(); 

	    video.play();  
	    video.pause(); 
	    video.stop();  

	}

}
