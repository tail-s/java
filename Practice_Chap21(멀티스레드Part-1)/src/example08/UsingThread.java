package example08;

public class UsingThread extends Thread {
	
	private Toilet toilet;
	
	public UsingThread(Toilet toilet, String name) {
		this.toilet = toilet;
		this.setName(name);
		
	}
	
	@Override
	public void run() {
		try {
			this.toilet.knock();
			this.toilet.use();
		} catch (Exception e) {}
	}

}
