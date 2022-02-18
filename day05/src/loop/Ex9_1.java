package loop;

public class Ex9_1 {

	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard();
		SutdaCard c2 = new SutdaCard();
		
		System.out.println(c1.equals(c2));
		

	}

}
class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1,true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard) {
			SutdaCard c = (SutdaCard)obj;
			return num == c.num && isKwang == c.isKwang;
		}
		return false;
	}
	
	
	public String toString() {
		return num + (isKwang? "k" : "");
	}
}