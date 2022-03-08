package practice;

enum Direction { EAST, WEST, SOUTH, NORTH}

public class EnumEx1 {

	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Direction.valueOf(Direction.class, "EAST");
		
		System.out.println(d1);			//EAST
		System.out.println(d2);			//WEST
		System.out.println(d3);			//EAST
		
		System.out.println(d1 == d2);	//false
		System.out.println(d1 == d3);	//true
		System.out.println(d1.equals(d3));	//true
//		System.out.println(d1 > d3);	//에러
		System.out.println(d1.compareTo(d3));	//0
		System.out.println(d1.compareTo(d2));	//-1
		
		switch(d1) {		//The direction is EAST.
		case EAST:	//Direction.EAST라고 쓸 수 없다.
			System.out.println("The direction is EAST.");
			break;
		case WEST:
			System.out.println("The direction is WEST.");
			break;
		case SOUTH:
			System.out.println("The direction is SOUTH.");
			break;
		case NORTH:
			System.out.println("The direction is NORTH.");
			break;
		}
		
		Direction[] dArr = Direction.values();
		
		for(Direction d : dArr)			//for(Direction d : Direction.values())
			System.out.printf("%s = %d%n", d.name(), d.ordinal());
		//EAST = 0	WEST = 1	SOUTH = 2	NORTH = 3
	}
}
