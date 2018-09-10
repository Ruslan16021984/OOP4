package com.gmail.carbit3333333;

public class Rectangle extends Shape{
	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;
	public Rectangle(Point point1, Point point2, Point point3, Point point4) {
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
		return "Rectangle "
				+ "[AB=" + point1.getX() +", "+ point1.getY()
				+ ", BC=" + point2.getX() +", "+ point2.getY() 
				+ ", AC=" + point3.getX() +", "+ point3.getY() 
				+ ", CD=" + point4.getX() +", "+ point4.getY() + "]";
	}
	
}
