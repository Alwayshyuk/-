package oop.method3;

public class Player {

	String name;
	String sub;
	String season; 
	int gold;
	int silver;
	int bronze;
	
	void setting(String name, String sub, String season, int g, int s, int b) {
		this.name = name;
		this.sub = sub;
		this.season = season;
		this.gold = g;
		this.silver = s;
		this.bronze = b;
	}
	
	void print() {
		System.out.printf("%s은(는) %s종목의 %s대회에서 금메달 %d개, 은메달 %d개, 동메달 %d개를 획득했다.\n"
				, this.name, this.sub, this.season, this.gold, this.silver, this.bronze);
	}
}
