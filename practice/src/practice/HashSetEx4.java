package practice;

import java.util.*;

public class HashSetEx4 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person2("David", 10));
		set.add(new Person2("David", 10));
		
		System.out.println(set);			//[abc, David:10]
	}
}
class Person2{
	String name;
	int age;
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}
	public int hashCode() {
		return (name + age).hashCode();
		//return Object.hash(name, age);	//int hash(Object...values) 이걸 쓰는 걸 권장 
	}
	public String toString(){
		return name +":"+age;
	}
}