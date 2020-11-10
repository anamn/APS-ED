package br.aps.timer;

public class Timer {
	
	private long last; //Inicializar antes 
	
	private long now; //Inicializar apos a ordenaçao terminar
	
	private float time;
	
	public void start() {
		this.last = System.nanoTime();
	}
	
	public void end() {
		this.now = System.nanoTime(); 
		this.time = now - last;
		System.out.println("Ordenamento levou " + time /1000000000 + " segundos."); 
	}

}
