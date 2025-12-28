package Day4;

public class Stopwatch {
	public static void main(String[] args) {
		StopWatchImplementation sw=new StopWatchImplementation();
				sw.start();
		
		for(int i=0; i<1000; i++) {
			sw.incrementTick();
		}
		sw.stop();
		System.out.println(sw.elapsed());
		
		sw.reset();
		
		System.out.println("After reset : "+sw.elapsed());
	}
	
}

class StopWatchImplementation{
	private boolean running=false;
	private int ticks=0;
	
	public void start() {
		running=true;
	}
	
public void stop() {
		running=false;
	}

public void reset() {
	ticks=0;
}

public int elapsed() {
	return ticks;
}
	 public void incrementTick() {
	        if (running) {
	            ticks++;
	        }
	    
}

}