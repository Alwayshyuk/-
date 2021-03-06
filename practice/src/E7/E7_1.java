/*
 * 2022-02-12 21:19
 * 자바의 정석 연습문제 7_1 ~ 7-2
 */




package E7;

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i = 0; i<cards.length;i++) {
			int num = i%10 +1;
			boolean isKwang = i<10 && (num==1 || num ==3 || num==8);
			

			cards[i] = new SutdaCard ( num, isKwang);
		}	
	}
	void shuffle() {
		for(int i = 0; i<cards.length; i++) {
			SutdaCard tmp;
			int r = (int)(Math.random()*20);
			tmp = cards[i];
			cards[i] = cards[r];
			cards[r] = tmp;
		}
	}
	SutdaCard pick(int index) {
		return cards[index];
	}
	SutdaCard pick() {
		int i = (int)(Math.random()*20);
		return cards[i];
	}
	
}
class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "k" : "");
	}
}
public class E7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+",");
		}
		System.out.println();
		System.out.println(deck.pick(0));

	}

}