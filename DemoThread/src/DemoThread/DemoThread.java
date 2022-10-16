package DemoThread;

public class DemoThread extends Thread {
	public static void main(String[] args) {
	    DemoThread thread = new DemoThread();
	    thread.start();
	    System.out.println("This code is outside of the thread");
	  }
	  public void run() {
	    System.out.println("This code is running in a thread");
	  }
}
