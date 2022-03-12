package practice;

public class ThreadEx5 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		
		ThreadEx5_1 t1 = new ThreadEx5_1();
		t1.start();
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i<300; i++)
			System.out.printf("%s", new String("-"));
		
		System.out.print("소요시간 1: "+(System.currentTimeMillis() - startTime));
		//---|||||||----||---||소요시간2: 26소요시간 1: 28
	}
}
class ThreadEx5_1 extends Thread	{
	public void run()	{
		for(int i = 0; i<300; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.print("소요시간2: " + (System.currentTimeMillis()-ThreadEx5.startTime));
	}
}
