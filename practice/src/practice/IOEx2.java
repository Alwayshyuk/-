package practice;

import java.io.*;
import java.util.Arrays;
public class IOEx2 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] tmp = new byte[10];
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		input.read(tmp, 0, tmp.length);//읽어온 데이터를 배열 tmp에 담는다.
		output.write(tmp, 5, 5);//tmp[5]부터 5개의 데이터를 write한다.
		
		outSrc = output.toByteArray();
		
		System.out.println(Arrays.toString(inSrc));
		System.out.println(Arrays.toString(outSrc));
		System.out.println(Arrays.toString(tmp));
	}
}
