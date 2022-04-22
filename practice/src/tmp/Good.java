package tmp;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Good {

	public static void main(String[] args) {
		String input = "십만일";
		
		String num= "영일이삼사오육칠팔구";
		String unit = "십백천만";
		int[] number = {10,100,1000,10000};
		
		StringTokenizer st = new StringTokenizer(input, unit, true);
		//삼십, 삼만, 삼천, 삼백, 삼십, 삼
		int sum = 0;
		int tmp = 0;
		int result = 0;
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			int check = num.indexOf(token);
			
			if(check!=-1) {
				tmp = check;
			}else {
				
					result += tmp*number[unit.indexOf(token)];
				tmp=0;
			}
			
			System.out.println(result+tmp);
			
		
		}
		ZonedDateTime zdateTime = ZonedDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		System.out.println(zdateTime.format(formatter));
	}

}
