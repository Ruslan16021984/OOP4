package com.gmail.carbit3333333;

public class Square extends Shape {
	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;

	public Square(Point point1, Point point2, Point point3, Point point4) {
		super();
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.point4 = point4;
	}
	

	@Override
	public double getPerimetr() {
		double perimetr = 4*getLong();
		return perimetr;
	}

	@Override
	public double getArea() {
		double area = Math.pow(getLong(), 2);
		return area;
	}
	private double getPow(Point point1, Point point2) {
		double pow = Math.pow((point2.getX()- point1.getX()), 2) + 
				Math.pow((point2.getY()- point1.getY()), 2);
		return pow;
	}
	private double getLong() {
		double lon = Math.sqrt(getPow(point1, point2));
		return lon;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Square [point1=" + point1 + ", point2=" + point2 + ", point3=" + point3 + ", point4=" + point4 + "]";
	}
	

}
