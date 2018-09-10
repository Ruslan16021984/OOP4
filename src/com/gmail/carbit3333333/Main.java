package com.gmail.carbit3333333;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
		Point point1 = new Point(1, 23);
		Point point2 = new Point(3, 12);
		Point point3 = new Point(10, 3);
		Point point4 = new Point(2, 9);
		
		
		Triangle triangle1 = new Triangle(point1, point2, point3);
		triangle1.getArea();
		System.out.println(triangle1.getArea());
		System.out.println();
		
		Square square = new Square(point1, point2, point3, point4);
		square.getArea();
		System.out.println(square.getArea());
		System.out.println();
		
		Circle circle = new Circle(point1, point2);
		circle.getArea();
		System.out.println(circle.getArea());
		System.out.println();
		
		board.setShape(triangle1);
		board.setShape(square);
		board.setShape(circle);
		System.out.println();
		
		System.out.println(board.getAllArea());
	}

}
