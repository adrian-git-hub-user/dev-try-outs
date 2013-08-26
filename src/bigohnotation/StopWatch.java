package bigohnotation;

public class StopWatch {
	
	private final long start;
	
	public StopWatch(){
		this.start = System.currentTimeMillis();
	}
	
	public Long elapsedTime(){
		return System.currentTimeMillis() - start;
	}

}
