package practice;
import java.io.*;
import java.util.*;
public class PropertiesEx2 {

	public static void main(String[] args) {
		//commandline에서 inputfile을 지정해주지 않으면 프로그램을 종료한다.
		if(args.length != 1) {
			System.exit(0);
		}
		Properties prop = new Properties();
		String inputFile = args[0];
		
		try {
			prop.load(new FileInputStream(inputFile));
		}catch(IOException e) {
			System.exit(0);
		}
		String name = prop.getProperty("name");
		String[] data = prop.getProperty("data").split(",");
		int max = 0, min = 0;
		int sum = 0;
		
		for(int i = 0 ; i<data.length; i++) {
			int intValue = Integer.parseInt(data[i]);
			
			if(i == 0) max = min = intValue;
			
			if(max<intValue) max = intValue;
			else if(min>intValue) min = intValue;
			
			sum += intValue;
		}
		System.out.println(name);
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println((sum*100.0/data.length)/100);
	}
}
