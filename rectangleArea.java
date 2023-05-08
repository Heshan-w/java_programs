package projects;

class Rectangle {
	public int length, breadth;
	public void getData(int x, int y) {
		length = x;
		breadth = y;
	}
	public int calcArea() {
		int area = length * breadth;
		return area;
	}
}
public class rectangleArea {
	public static void main(String[] args) {
		int area1, area2;
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle();
		rectangle1.length = 10;
		rectangle1.breadth = 15;
		area1 = rectangle1.length * rectangle1.breadth;
		rectangle2.getData(250, 30);
		area2 = rectangle2.calcArea();
		System.out.println("The area of first rectangle = " + area1);
		System.out.println("The area of second rectangle = " + area2);
	}
}