package oop.method1;

public class Test01 {
	public static void main(String[] args) {
		// 학생 2명 생성 및 정보 설정 후 출력
		Student a = new Student(); // a -> { name= null, score = 0}
		Student b = new Student(); // b -> { name= null, score = 0}

		// 정보 설정
		// a에 피카츄, 70점 설정
		a.name = "피카츄";
		a.score = 70;

		// b에 라이츄, 85점 설정
		b.name = "라이츄";
		b.score = 85;

		// 출력
		// a의 정보를 출력해라!
		System.out.println("이름: " + a.name);
		System.out.println("점수: " + a.score);
		
		a.print(); // a를 주인공으로 해서 print()의 코드를 실행해라

		// b의 정보를 출력해라!
		System.out.println("이름: " + b.name);
		System.out.println("점수: " + b.score);
		
		b.print(); // b를 주인공으로 해서 print()의 코드를 실행해라

	}
}
