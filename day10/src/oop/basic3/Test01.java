package oop.basic3;

public class Test01 {

	public static void main(String[] args) {
		korean k = new korean();
		korean k1 = new korean();
		korean k2 = new korean();	
		
		k.name = "진종오";
		k1.name = "김수녕";
		k2.name = "전이경";
		
		k.sub = "사격";
		k1.sub = "양궁";
		k2.sub = "쇼트트랙";
		
		k.season = "하계";
		k1.season = "하계";
		k2.season = "동계";
		
		k.gold = 4;
		k1.gold = 4;
		k2.gold = 4;
		
		k.silver = 2;
		k1.silver = 1;
		k2.silver = 0;
		
		k1.bronze = 1;
		k2.bronze = 1;
		
		k.print(k);
		k.print(k1);
		k.print(k2);
	}

}
