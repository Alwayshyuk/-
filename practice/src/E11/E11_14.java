package E11;

import java.io.*;
import java.util.*;

public class E11_14 {
	static ArrayList record = new ArrayList();
	static Scanner s = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		while(true) {
			switch(displayMenu()) {
			case 1:
				inputRecord();
				break;
			case 2:
				displayRecord();
				break;
			case 3:
				System.out.println("종료");
				System.exit(0);
			}
		}
	
	}

	static int displayMenu() {
		System.out.println("성적 관리 프로그램");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 확인");
		System.out.println("3. 프로그램 종료");
		System.out.print("원하는 메뉴를 선택하세요 1~3");
		
		int menu = 0;
		
		do {
			try {
				menu = Integer.parseInt(s.nextLine().trim());
				
				if(1<= menu && menu<=3) {
					break;
				}else
					throw new Exception();
			} catch (Exception e) {
				System.out.println("retry");
			}
		}while(true);
		
		return menu;
	}
	static void inputRecord() {
		System.out.println("1. 학생성적 입력하기");
		
		while(true) {
			System.out.print(">>");
			
			try {
				String input = s.nextLine().trim();
				if(!input.equalsIgnoreCase("q")) {
					Scanner s2 = new Scanner(input).useDelimiter(",");
					record.add(new Student5(s2.next(), s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt(), s2.nextInt() ));
					System.out.println("good");
				}else
					return;
			} catch(Exception e) {
				System.out.println("오류");
			}
			}
	}
		static void displayRecord() {
			int koreanTotal =0;
			int englishTotal =0;
			int mathTotal =0;
			int total =0;
			
			int length = record.size();
			
			if(length>0) {
				System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
				System.out.println("===============================================");
				
				for(int i = 0; i<length; i++) {
					Student5 student = (Student5)record.get(i);
					System.out.println(student);
					koreanTotal+=student.kor;
					englishTotal+=student.eng;
					mathTotal+=student.math;
					total+=student.total;
				}
				System.out.println("=====================================================");
				System.out.println("총점: " + koreanTotal + englishTotal+mathTotal);
				
			}else
				System.out.println("no data");
		}
		
	}


class Student5 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank;
	int classRank; // 반등수

	Student5(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public int compareTo(Object o) {
		if (o instanceof Student5) {
			Student5 tmp = (Student5) o;
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()
				+ "," + schoolRank + "," + classRank;
	}
} // class Student