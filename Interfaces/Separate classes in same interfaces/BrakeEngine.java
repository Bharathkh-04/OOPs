package Interfacesdemo;

public class BrakeEngine implements Brake {

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("reduce speed");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("increase speed");
	}

}
