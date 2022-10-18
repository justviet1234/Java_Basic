package DemoMultithreading;

public class MathCos extends Thread {
	double deg,result;
    public MathCos(double degree)
    {
    deg=degree;
    }
    public void run()
    {
    result=Math.cos(deg);   
    }
}
