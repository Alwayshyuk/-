package E12;

public class E12_5 {

	public static void main(String[] args) {
		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);
		
		d.shuffle();
		c = d.pick(0);
		System.out.println(c);
		}

}

class Deck	{
	final int CARD_NUM = Card.Kind.values().length*Card.Number.values().length;	//카드개수
	
	Card cardArr[] = new Card[CARD_NUM];	//Card객체 배열을 포함
	
	Deck() {
		int i = 0;
		
		for(Card.Kind kind : Card.Kind.values()) {
			for(Card.Number num : Card.Number.values()) {
				cardArr[i++] = new Card(kind, num);
			}
		}
	}
	
	Card pick(int index) {		//저장된 위치index에 있는 카드 하나를 꺼내서 반환
		return cardArr[index];
	}
	
	Card pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	
	void shuffle() {		//카드의 순서를 섞는다.
		for(int i = 0; i<cardArr.length; i++) {
			int r = (int)(Math.random()*CARD_NUM);
			
			Card tmp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = tmp;
		}
	}
}

class Card	{
	enum Kind { CLOVER, HEART, DIAMOND, SPADE }
	enum Number {
		ACE, TWO, THREE, FOUR, FIVE,
		SIX, SEVEN, EIGHT, NINE, TEN,
		JACK, QUEEN, KING
	}
	
	Kind kind;
	Number num;
	
	Card() {
		this(Kind.SPADE, Number.ACE);
	}
	Card(Kind kind, Number num) {
		this.kind = kind;
		this.num = num;
	}
	public String toString() {
		return "["+kind.name() + "," + num.name()+"]";
	}
}