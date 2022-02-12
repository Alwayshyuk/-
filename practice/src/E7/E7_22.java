/*
 * 2022-02-12 23:44
 * 자바의 정석 연습문제 7-22~7-23
 */


package E7;

public class E7_22 {
	static double sumArea(Shape[] arr){
		
		double sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum +=arr[i].calcArea();
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
		System.out.println("면적의 합: " + sumArea(arr)); 

	}

}

abstract class Shape{
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p=p;
	}
	abstract double calcArea();
	
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p = p;
	}
}

class Point{
	int x;
	int y;
	
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

class Circle extends Shape{
	double r;
	
	Circle(){
		this(1);
	}
	
	Circle(double r){
		this.r = r;
	}
	
	double calcArea() {
		return r*r*Math.PI;
	}
}
class Rectangle extends Shape{
	double width;
	double height;
	
	Rectangle(){
		this(1,1);
	}
	
	
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	double calcArea() {
		return width*height;
	}
	boolean isSquare() {
		if(width==height)
			return true;
		else
			return false;
	}
}