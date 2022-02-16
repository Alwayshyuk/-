package practice;

import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		String input = "삼십만삼천백십오";
		System.out.println(han(input));
		BigInteger val = new BigInteger("FFFF", 16);
		System.out.println(BigInteger.TEN);
	}

	public static long han(String input) {
		long result = 0;
		long tmpResult = 0;
		long num = 0;
		
		final String NUM = "영일이삼사오육칠팔구";
		final String UNIT = "십백천만억조";
		final long[] UNIT_NUM = {10, 100, 1000, 10000, (long)1e8, (long)1e12};
		
		StringTokenizer st = new StringTokenizer(input, UNIT, true);
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			int check = NUM.indexOf(token);
		
			if(check == -1) {
				if("만억조".indexOf(token) == -1) {
					tmpResult += (num != 0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];
					} else {
						tmpResult +=num;
						result = (tmpResult != 0? tmpResult : 1)*UNIT_NUM[UNIT.indexOf(token)];
						tmpResult = 0;
					}
				num =0;
			} else {	//숫자인 경우
				num = check;
			}
		}
		return result + num + tmpResult;
}
		
	

}
