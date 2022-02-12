/*
 * 2022-02-12 23:24
 * 자바의 정석 연습문제 19
 */


package E7;

public class E7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}

}
class Buyer {
	int money = 1000;
	Product [] cart = new Product[3];
	int i = 0;
	
	void buy (Product p) {
		if(p.price > money) {
			System.out.println("not enough money");
			return;
		}
		
			money-=p.price;
			add(p);
	}
	
	void add (Product p) {
		if(i>=cart.length) {
			Product [] cart2 = new Product [cart.length*2];
			System.arraycopy(cart, 0, cart2, 0, cart.length);
			cart = cart2;
		}
		cart[i] = p;
		i++;
	}
	
	void summary() {
		String itemlist = "";
		int sum = 0;
		
		for(int i = 0; i<cart.length; i++) {
			if(cart[i]==null)
				break;
			itemlist += cart[i] + ",";
			sum+= cart[i].price;
		}
		
		System.out.println("itemlist : "+itemlist);
		System.out.println("pay : " + sum);
		System.out.println("leftMoney : " + money);
		}
}


class Product{
	int price;
	
	Product(int price){
		this.price = price;
	}
}
class Tv extends Product {
	Tv(){ super(100);}
	public String toString() {return "Tv";}
}

class Computer extends Product{
	Computer(){super(200);}
	public String toString() {return "Computer";}
}

class Audio extends Product{
	Audio(){super(500);}
	public String toString() {return "Audio";}
}