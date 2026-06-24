package Interfacesdemo;

public class Cdplayer implements Media {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("I am vibing with song");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Hey who paused song");
	}

}
