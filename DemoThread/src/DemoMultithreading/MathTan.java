package DemoMultithreading;

public class MathTan extends Thread {
	 double deg,result;
	    public MathTan(double degree)
	    {
	    deg=degree;   
	    }
	    public void run()
	    {
	    result=Math.tan(deg);   
	    }
}
