package E9;

public class E9_6 {
	public static String fillZero(String src, int length) {
		
		
		char[] c = new char[length];
		
		if(src == null || src.length() == length)
			return src;
		else if(length<=0)
			return "";
		else if(src.length()>length)
			return src.substring(0, length);
		
		for(int i = 0; i<c.length; i++)
			c[i] = '0';

		System.arraycopy(src.toCharArray(), 0, c, length-src.length(), src.length());
		
		return new String(c);
	}

	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
	}
}