package practice;

import java.util.*;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc"); set.add("alien"); set.add("bat");
		set.add("car"); set.add("Car"); set.add("disc");
		set.add("dance"); set.add("dZZZZ"); set.add("dzzzz");
		set.add("elephant"); set.add("elevator"); set.add("fan");
		set.add("flower");
		
		System.out.println(set);	//[Car, abc, alien, bat, car, dZZZZ, dance, disc, dzzzz, elephant, elevator, fan, flower]
		System.out.println(set.subSet(from, to));	//[bat, car]
		System.out.println(set.subSet(from, to + "zzz"));	//[bat, car, dZZZZ, dance, disc]
	}
}
