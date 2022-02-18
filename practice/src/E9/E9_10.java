package E9;

public class E9_10 {
	public static String format (String str, int length, int alignment) {
		if(length<str.length()) {
			return str.substring(length);
			}
		else {
			char[] c = new char[length];
			for(int i = 0; i<c.length; i++)
				c[i] = ' ';
			
			char[] s = new char[str.length()];
			for(int i = 0; i<str.length(); i++)
				s[i] = str.charAt(i);
					
			
		if(alignment == 0)
			System.arraycopy(s, 0, c, 0, str.length());
		else if(alignment == 1)
			System.arraycopy(s, 0, c, (c.length-str.length())/2, str.length());
		else
			System.arraycopy(s, 0, c, c.length-str.length(), str.length());
		
		return new String(c);
	}
		}
	
	
	
	public static void main(String[] args) {

		String str = "가나다";
		System.out.println(format(str, 7, 0)); // 왼쪽 정렬
		System.out.println(format(str, 7, 1)); // 가운데 정렬
		System.out.println(format(str, 7, 2)); // 오른쪽 정렬
	}
}