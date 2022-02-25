package practice;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13}, {21,22,23}};
		
		System.out.println(Arrays.toString(arr));				//[0, 1, 2, 3, 4]
		System.out.println(Arrays.deepToString(arr2D));			//[[11, 12, 13], [21, 22, 23]]
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);	
		int[] arr3 = Arrays.copyOf(arr, 3);					
		int[] arr4 = Arrays.copyOf(arr, 7);						
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		System.out.println(Arrays.toString(arr2));				//[0, 1, 2, 3, 4]
		System.out.println(Arrays.toString(arr3));				//[0, 1, 2]
		System.out.println(Arrays.toString(arr4));				//[0, 1, 2, 3, 4, 0, 0]
		System.out.println(Arrays.toString(arr5));				//[2, 3]
		System.out.println(Arrays.toString(arr6));				//[0, 1, 2, 3, 4, 0, 0]
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		System.out.println(Arrays.toString(arr7));				//[9,9,9,9,9]
		
		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
		System.out.println(Arrays.toString(arr7));					//[1, 1, 2, 1, 1]
		
		for(int i : arr7) {
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.print(new String(graph)+i);					//*1 *1 **2 *1 *1
		}
		
		String[][] str2D = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));			//false
		System.out.println(Arrays.deepEquals(str2D, str2D2));		//true
		
		char[] chArr = {'A', 'D', 'C', 'B', 'E'};
		
		System.out.println(Arrays.toString(chArr));					//[A,D,C,B,E]
		System.out.println(Arrays.binarySearch(chArr, 'B'));		//-2
		Arrays.sort(chArr);
		System.out.println(Arrays.toString(chArr));					//[A,B,C,D,E]
		System.out.println(Arrays.binarySearch(chArr, 'B'));		//1
	}
}
