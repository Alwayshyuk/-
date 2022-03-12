package practice;

public class TreadEx4 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for(int i =0; i<300; i++)
			System.out.printf("%s", new String("-"));
		
		System.out.println("\n소요시간 1: " + (System.currentTimeMillis() - startTime));
		//소요시간 1: 20
		
		for(int i = 0; i<300; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.println("\n소요시간 2: "+ (System.currentTimeMillis() - startTime));
		//소요시간 2: 24
	}
}
