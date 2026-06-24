package Interfacesdemo;

public class DieselEngine implements Engine{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("I am riding a diesel engine");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("I stopped riding diesel engine");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("wanna fly with this car at 100kmph");
	}

}
