/*
 * 
 * 2022-02-12 21:50
 * 자바의 정석 연습문제 7-10 ~ 7-11
 */



package E7;

public class E7_10 {

	public static void main(String[] args) {

		MyTv2 t = new MyTv2();
		
		t.setVolume(20);
		System.out.println("VOL : " + t.getVolume());
		System.out.println();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
	}

}

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void setChannel( int c) {
		prevChannel = channel;
		channel = c;
	}
	
	int getChannel() {
		return  channel;
	 }
	
	void setVolume( int v) {
		volume = v;
	}
	
	int getVolume() {
		return  volume;
	}
	
	void setIsPowerOn(boolean p) {
		isPowerOn = p;
	}
	
	boolean getIsPowerOn() {
		return isPowerOn;
	}
	
	void gotoPrevChannel() {
		setChannel(prevChannel);
	}
	 
}