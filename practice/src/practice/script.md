이제 이 메서드의 매개변수로 FruitBox< Fruit >뿐 아니라, FruitBox< Apple >와 FruitBox< Grape >도 가능하게 된다.     

```java
FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
FruitBox<Apple> appleBox = new FruitBox<Apple>();
	...
System.out.println(Juicer.makeJuice(fruitBox));
System.out.println(Juicer.makeJuice(appleBox));
```

매개변수의 타입을 FruitBox< ? extends Object >로 하면, 모든 종류의 FruitBox가 이 메서드의 매개변수로 가능해진다.     
대신 box의 요소가 Fruit의 자손이라는 보장이 없으므로 아래의 for문에서 box에 저장된 요소를 Fruit타입의 참조변수로 못받는다.

```java
static Juice makeJuice(FruitBox <? extends Object> box {
	String tmp = " ";
	for(Fruit f : box.getList())
		tmp += f + " ";			//에러. Fruit이 아닐 수 있음
	return new Juice(tmp);
```

그러나 실제로 테스트하면 문제없이 컴파일되는데 그 이유는 지네릭 클래스 FruitBox를 제한했기 때문이다.

```java
class FruitBox <T extends Fruit> extends Box<T> {}
```

컴파일러는 위 문장으로부터 모든 FruitBox의 요소들이 Fruit의 자손이라는 것을 알고 있으므로 문제 삼지 않는 것이다.

```java
import java.util.ArrayList;
class Fruit { public String toString() { return "Fruit";}}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Juice {
	String name;
	
	Juice(String name) { this.name = name + "Juice";}
	public String toString() { return name;}
}
class Juicer{
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = " ";
		
		for(Fruit f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}
public class FruitBoxEx3 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}
}
class FruitBox <T extends Fruit> extends Box<T>{}
class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);}
	T get(int i) { return list.get(i);}
	ArrayList<T> getList() { return list;}
	int size() { return list.size();}
	public String toString() { return list.toString();}
}
```

