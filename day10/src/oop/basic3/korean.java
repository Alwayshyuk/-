package oop.basic3;

public class korean {
	String name;
	String sub;
	String season;
	int gold;
	int silver;
	int bronze;
	
	static void print(korean k) {
		System.out.printf("%s은 %s종목의 %s대회에서 금메달 %d개, 은메달 %d개, 동메달 %d개를 획득했다.\n"
				, k.name, k.sub, k.season, k.gold, k.silver, k.bronze);
	}
}
