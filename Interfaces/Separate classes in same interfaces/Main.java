package Interfacesdemo;

public class Main {
public static void main(String[] args) {
	
////	Car obj=new Car();
////	obj.start();
//	
//	Engine obj1=new Car();
//	obj1.accelerate();
	

	Mycar obj2=new Mycar(new PetrolEngine(),new Cdplayer(),new BrakeEngine());
	obj2.start();
	obj2.stop();
	
	obj2.startbrake();
	
	Mycar obj3=new Mycar();
	obj3.start();
	obj3.changeEngine(new PetrolEngine());
	obj3.start();
}

}
