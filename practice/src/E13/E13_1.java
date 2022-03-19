package E13;

public class E13_1 {
	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i = 0; i<300; i++)
				System.out.print("-");
		};
		
		Thread th1 = new Thread(r);
				
	}
}
