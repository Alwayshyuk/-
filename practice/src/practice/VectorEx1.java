package practice;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		Vector v = new Vector(5);	//용량capacity이 5인 Vector를 생성한다.
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);		//[1, 2, 3]
						//size: 3
						//capacity: 5
		
		v.trimToSize();//빈 공간을 없앤다.	배열은 크기를 변경할 수 없기 때문에 새로운 배열을 생성해서 그 주소값을 v에 할당한다.
		print(v);		//[1, 2, 3]		기존의 Vector인스턴스는 더 이상 사용할 수 없으며, 후에 가비지컬렉터에 의해 메모리에서 제거된다.
						//size: 3
						//capacity: 3
		
		v.ensureCapacity(6); 		//용량을 최소 6으로 늘린다. 이미 용량이 6을 넘는다면 아무 일도 일어나지 않는다.
		print(v);		//[1, 2, 3]
						//size: 3
						//capacity: 6
		
		v.setSize(7);				//사이즈를 7로 만든다. capacity는 항상 기존의 크기보다 2배로 증가하므로 12다.
		print(v);		//[1, 2, 3, null, null, null, null]
						//size: 7
						//capacity: 12
		
		v.clear();		//모두 삭제한다.
		print(v);		//[]
						//size: 0
						//capacity: 12
	}
	
	static void print(Vector v) {
		System.out.println(v);
		System.out.println("size: "+v.size());
		System.out.println("capacity: " + v.capacity());
	}

}
