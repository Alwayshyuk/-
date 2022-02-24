package oop.method1;

public class Student {
	//멤버필드(변수)
	String name;
	int score;
	
	//멤버메소드 - 코드
	//void 이름(){코드}
	void print() {
		/*메소드는 어떤 객체에서 실행될 지 모른다.
		 * 실행한 주인공을 this라고 부를 수 있도록 지원한다.
		 * this == 싱해앟ㄴ 주인공 객체(자기 자신)
		 */
		System.out.println("이름: " + this.name);
		System.out.println("점수: " + this.score + "점");}
	
	void setting(String s, int i) {
		this.name = s;
		this.score = i;
		
	}


}
