package DemoMultithreading;

public class MathSin extends Thread {
	double deg,result;
    public MathSin(double degree)
    {
    deg=degree;   
    }
    public void run()
    {
    result=Math.sin(deg);   
    }
}
