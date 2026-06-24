package Interfacesdemo;

public class PetrolEngine implements Engine{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("ride petrol engine");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop petrol engine");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("speed upto 180kmph at petrol engine");
	}

}
