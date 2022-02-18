package E9;

public class E9_8 {
	
	
	static double round (double d, int n ) {
		d*=Math.pow(10, n);
		d = Math.round(d);
		d/= Math.pow(10, n);
		
		return d;
		
	}

	public static void main(String[] args) {
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
	}
}