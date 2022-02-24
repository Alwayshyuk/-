package oop.method3;

public class Test01 {

	public static void main(String[] args) {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		p1.setting("진종오", "사격", "하계", 4, 2, 0);
		p2.setting("김수녕", "양궁", "하계", 4, 1, 1);
		p3.setting("진이경", "쇼트트랙", "동계", 4, 0, 1);

		
		p1.print();
		p2.print();
		p3.print();
	}

}
