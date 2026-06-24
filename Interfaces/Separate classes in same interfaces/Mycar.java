package Interfacesdemo;

public class Mycar {

	private Engine engine;
	private Media media;
	private Brake brake;
	public Mycar(Engine engine, Media media,Brake brake) {
		super();
		this.engine = engine;
		this.media = media;
		this.brake=brake;
	}
	
	Mycar()
	{
		engine=new DieselEngine();
	}

	public void start() {
		
		engine.start();
	}

	public void stop() {
		// TODO Auto-generated method stub
		engine.stop();
	}
	public void accelerate() {
		// TODO Auto-generated method stub
		engine.accelerate();
	}
	
	
	public void play()
	{
		media.play();
	}
	
	public void pause()
	{
		media.pause();
	}
	
	public void brake() {
		// TODO Auto-generated method stub
		brake.brake();
	}
	
	public void startbrake() {
		// TODO Auto-generated method stub
		brake.start();
	}
	public void changeEngine(Engine engine)
	{
		this.engine=engine;
	}
	
}
