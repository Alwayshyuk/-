package oop.basic2;

public class Tesst01 {

	public static void main(String[] args) {
		
		Olympic o = new Olympic();
		Olympic o1 = new Olympic();
		Olympic o2 = new Olympic();
		
		o.raking = 1;
		o1.raking = 2;
		o2.raking = 3;
		
		o.name = "노르웨이";
		o1.name = "독일";
		o2.name = "중국";
		
		o.goldMedal = 16;
		o1.goldMedal = 12;
		o2.goldMedal = 9;
		
		o.silverMedal = 8;
		o1.silverMedal = 10;
		o2.silverMedal = 4;
		
		o.bronzeMedal = 13;
		o1.bronzeMedal = 5;
		o2.bronzeMedal = 2;
		
		o.print(o);
		o.print(o1);
		o.print(o2);
		
	}

}

class Olympic{
	
	int raking;
	String name;
	int goldMedal;
	int silverMedal;
	int bronzeMedal;
	
	static void print(Olympic o) {
		System.out.printf("%d위의 %s는 금메달 %d개, 은메달 %d개, 동메달 %d개 획득했습니다.\n",o.raking, o.name, o.goldMedal, o.silverMedal, o.bronzeMedal);
	}
	
}