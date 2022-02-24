package oop.basic1;

public class Test02 {

	public static void main(String[] args) {
		
		Message a = new Message();	//메세지를 1개 만들고 a라는 리모컨에 연결하세요!
		
		
		a.sender = "초롱초롱 라이언";
		a.content = "응 먹고 가는중";
		a.time = "오후 12:29";
		a.unread = 0;
		System.out.println(a); 		//참조변수(리모컨) 정보
		System.out.println(a.sender);	//a리모컨에 연결된 객체의 sender 정보 출력
		System.out.println(a.content);	//a리모컨에 연결된 객체의 content 정보 출력
		System.out.println(a.time);		//a리모컨에 연결된 객체의 time 정보 출력
		System.out.println(a.unread);	//a리모컨에 연결된 객체의 unread 정보 출력
		
		
		/*
		 * 클래스 class
		 * 사용자가 필요에 의해서 만든 데이터 묶음(사용자 정의 자료형)
		 * 내부에는 변수 등을 배치하여 구성요소를 정의
		 * 
		 * 객체 object
		 * 클래스를 이용해서 만든 데이터 덩어리
		 * 프로그래밍 상에서 만들어진 객체는 인스턴스instance라고도 부름
		 * 
		 * 레퍼런스reference 참조변수
		 * 객체를 제어할 수 있는 리모컨 형태의 변수
		 * 
		 * 
		 */
	}

}
