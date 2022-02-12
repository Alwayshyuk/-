/*
 * 2022-02-13 00:21
 * 자바의 정석 연습문제 8-9
 * 
 * Exception in thread "main" E8.UnsupportedFuctionException: [100]지원하지 않는 기능입니다.
	at E8.E8_9.main(E8_9.java:7)

 * 
 * 
 */
package E8;

public class E8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
	}

}
class UnsupportedFuctionException extends RuntimeException{

	private final int ERR_CODE;
	
	UnsupportedFuctionException(String msg, int i){
		super(msg);
		this.ERR_CODE = i;
	}

	UnsupportedFuctionException(String msg){
		this(msg, 100);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	public String getMessage() {
		return "[" + getErrorCode() + "]" + super.getMessage();		
	}
}