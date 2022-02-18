package E9;

public class E9_12 {
	public static void main(String[] args) {
		
		for(int i = 0; i<20; i++)
			System.out.print(getRand(1,-3)+",");
	}
	
	
	static int getRand (int from, int to) {
		
		int a = (int)(Math.random()*Math.abs(to-from)) + Math.min(from, to);
		return a;
	}
}