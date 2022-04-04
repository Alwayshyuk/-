package practice;

import java.io.*;
import java.util.Arrays;
public class IOEx3 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] tmp = new byte[4];
		
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output =  new ByteArrayOutputStream();
		
		try {
			while(input.available()>0) {
				input.read(tmp);
				output.write(tmp);
				
				outSrc = output.toByteArray();
				printArrays(tmp,outSrc);
			}
		} catch (IOException e) {}
	}		
		static void printArrays(byte[] tmp, byte[] outSrc) {
			System.out.println("tmp: "+Arrays.toString(tmp));
			System.out.println("Output Source: "+Arrays.toString(outSrc));
		}
}

