package practice;

import java.util.*;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i = 0; i<score.length; i++)
			set.add(score[i]);
		
		System.out.println(set.headSet(new Integer(50)));		//50보다 작은 값[10, 35, 45]
		System.out.println(set.tailSet(new Integer(50)));		//50보다 큰 값[50, 65, 80, 95, 100]
	}
}
