package oop.method4;

public class Menu {
	String name, sort;
	int price;
	boolean event;
	
	void setting(String n, String s, int p, boolean e) {
		this.name = n;
		this.sort = s;
		this.price = p;
		this.event = e;
	}
	
	void setting(String n, String s, int p) {
		this.name = n;
		this.sort = s;
		this.price = p;
		this.event = false;
	}
	
	void print() {
		if(this.event) {
			int eventPrice = (int) (price*0.9);
			System.out.println("이름: " + this.name);
			System.out.println("분류: " + this.sort);
			System.out.println("가격: " + this.price + " -> " + eventPrice + " 행사중");
		}
		else {
			System.out.println("이름: " + this.name);
			System.out.println("분류: " + this.sort);
			System.out.println("가격: " + this.price);
		}
	}
}
