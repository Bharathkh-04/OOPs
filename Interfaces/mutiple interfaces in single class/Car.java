package Interfacesdemo;

public class Car implements Engine,Brake,Media{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("I am playing song");
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("I stopped playing");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("I braked suddenly");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("I enjoyed ride");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("I stopped ddriving");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("I speeded up");
	}


}
