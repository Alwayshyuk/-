package oop.method2;

public class Medal {
	int rank;
	String name;
	int gold;
	int silver;
	int bronze;
	
	void setting(int r, String n, int g, int s, int b) {
		this.rank = r;
		this.name = n;
		this.gold = g;
		this.silver = s;
		this.bronze = b;
	}
	
	void print() {
		System.out.printf("%d위의 %s은(는) 금메달 %d개, 은메달 %d개, 동메달 %d개 획득했습니다.\n"
				,this.rank, this.name, this.gold, this.silver, this.bronze);

	}
}
