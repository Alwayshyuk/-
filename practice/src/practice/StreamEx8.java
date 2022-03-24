package practice;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;


public class StreamEx8 {

	public static void main(String[] args) {
		Student[] stuArr = {
				new Student("나자바", true, 1, 1, 300),
				new Student("김지미", false, 1, 1, 250),
				new Student("김자바", true, 1, 1, 200),
				new Student("이지미", false, 1, 2, 150),
				new Student("남자바", true, 1, 2, 100),
				new Student("안지미", false, 1, 2, 50),
				new Student("황지미", false, 1, 3, 100),
				new Student("강지미", false, 1, 3, 150),
				new Student("이자바", true, 1, 3, 200),
				
				new Student("나자바", true, 2, 1, 300),
				new Student("김지미", false, 2, 1, 250),
				new Student("김자바", true, 2, 1, 200),
				new Student("이지미", false, 2, 2, 150),
				new Student("남자바", true, 2, 2, 100),
				new Student("안지미", false, 2, 2, 50),
				new Student("황지미", false, 2, 3, 100),
				new Student("강지미", false, 2, 3, 150),
				new Student("이자바", true, 2, 3, 200)};
		
		Map<Integer, List<Student>> stuByBan = Stream.of(stuArr)
				.collect(groupingBy(Student::getBan));
		
		for(List<Student> ban: stuByBan.values()) {
			for(Student s : ban)
				System.out.println(s);
		}
		
		Map<Student.Level, List<Student>> stuByLevel = Stream.of(stuArr)
				.collect(groupingBy(s-> {
					if(s.getScore() >= 200) return Student.Level.HIGH;
					else if(s.getScore() >= 100) return Student.Level.MID;
					else return Student.Level.LOW;
				}));
		TreeSet<Student.Level> keySet = new TreeSet<>(stuByLevel.keySet());
		for(Student.Level key : keySet) {
			System.out.println(key);
			
			for(Student s : stuByLevel.get(key))
				System.out.println(s);
			System.out.println();
		}
		
		Map<Student.Level, Long> stuCntByLevel = Stream.of(stuArr)
				.collect(groupingBy(s-> {
					if(s.getScore()>=200) return Student.Level.HIGH;
					else if(s.getScore() >= 100) return Student.Level.MID;
					else return Student.Level.LOW;
				}, counting()));
		
		for(Student.Level key : stuCntByLevel.keySet())
			System.out.printf("[%s] - %d명, ", key, stuCntByLevel.get(key));
		
		Map<Integer, Map<Integer, List<Student>>> stuByHakAndBan = 
				Stream.of(stuArr).collect(groupingBy(Student::getHak, groupingBy(Student::getBan)));
		
		for(Map<Integer, List<Student>> hak : stuByHakAndBan.values()) {
			for(List<Student> ban : hak.values()) {
				for(Student s : ban)
					System.out.println(s);
			}
		}
		
		Map<Integer, Map<Integer, Student>> topStuByHakAndBan = 
				Stream.of(stuArr).collect(groupingBy(Student::getHak, groupingBy(Student::getBan,
						collectingAndThen(maxBy(comparingInt(Student::getScore)), Optional::get))));
		
		for(Map<Integer, Student> ban : topStuByHakAndBan.values())
			for(Student s : ban.values())
				System.out.println(s);
		
		Map<String, Set<Student.Level>> stuByScoreGroup = Stream.of(stuArr)
				.collect(groupingBy(s->s.getHak()+"-"+s.getBan(),
						mapping(s->{
							if(s.getScore() >= 200) return Student.Level.HIGH;
							else if(s.getScore() >= 100) return Student.Level.MID;
							else return Student.Level.LOW;
						}, toSet())));
		
		Set<String> keySet2 = stuByScoreGroup.keySet();
		
		for(String key : keySet2) {
			System.out.println(key + stuByScoreGroup.get(key));
		}
	}

}
class Student {
	String name;
	boolean isMale;
	int hak,ban,score;
	
	Student(String name, boolean isMale, int hak, int ban, int score){
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}
	String getName() { return name; }
	boolean isMale() { return isMale; }
	int getHak() { return hak; }
	int getBan() { return ban; }
	int getScore() { return score; }
	
	public String toString() {
		return String.format("[ %s, %s, %d학년, %d반, %3d점]",
			name, isMale? "남":"여", hak, ban, score);
	}
	
	enum Level { HIGH, MID, LOW }
}