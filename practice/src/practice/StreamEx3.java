package practice;
import java.util.*;
import java.util.stream.*;

public class StreamEx3 {

	public static void main(String[] args) {
		Student[] stuArr = {
				new Student("이자바",3,300),
				new Student("김자바",1,200),
				new Student("안자바",2,100),
				new Student("박자바",2,150),
				new Student("소자바",1,200),
				new Student("나자바",3,290),
				new Student("감자바",3,180)
		};
		Stream<Student> stuStream = Stream.of(stuArr);
		
		stuStream.sorted(Comparator.comparing(Student::getBan)
				.thenComparing(Comparator.naturalOrder()))
				.forEach(System.out::println);
		//[김자바, 1, 200]	[소자바, 1, 200]	[박자바, 2, 150]	[안자바, 2, 100]
		//[이자바, 3, 300]	[나자바, 3, 290]	[감자바, 3, 180]
		
		stuStream = Stream.of(stuArr);	//스트림을 다시 생성한다.
		IntStream stuScoreStream = stuStream.mapToInt(Student::getTotalScore);
		
		IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
		System.out.println(stat.getCount());	//7
		System.out.println(stat.getSum());	//1420
		System.out.println(stat.getAverage());	//202.85714285714286
		System.out.println(stat.getMin());	//100
		System.out.println(stat.getMax());	//300
	}
}
class Student implements Comparable<Student>{
	String name;
	int ban, totalScore;
	Student(String name, int ban, int totalScore){
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	public String toString() {
		return String.format("[%s, %d, %d]",name,ban,totalScore).toString();
	}
	String getName() { return name; }
	int getBan()	{ return ban;	}
	int getTotalScore()	{	return totalScore;	}
	
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}
}