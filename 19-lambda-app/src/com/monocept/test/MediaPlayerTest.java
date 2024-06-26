package com.monocept.test;

import com.monocept.model.AudioPlayer;
import com.monocept.model.MediaPlayer;
import com.monocept.model.PodcastPlayer;
import com.monocept.model.VideoPlayer;

public class MediaPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MediaPlayer media=new AudioPlayer();
MediaPlayer.supportedFiles();
media.start();
media.stop();


MediaPlayer media1=new VideoPlayer();
MediaPlayer.supportedFiles();
media1.start();
media1.stop();




MediaPlayer media2=new PodcastPlayer();
MediaPlayer.supportedFiles();
media2.start();
media2.stop();

	}

}
