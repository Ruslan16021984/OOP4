package com.gmail.carbit3333333;

public class Circle extends Shape{
	private Point point1;
	private Point point2;
	
	
	public Circle(Point point1, Point point2) {
		super();
		this.point1 = point1;
		this.point2 = point2;
	}

	@Override
	public double getPerimetr() {
		double p = 2 * Math.PI * getArea();
		return p;
	}

	@Override
	public double getArea() {
		double s = Math.PI * Math.pow(getRadius(),2);
		return s;
	}
	private double getRadius() {
		double radius = Math.sqrt(getPow());
		return radius;
	}
	private double getPow() {
		double pow = Math.pow((point2.getX()- point1.getX()), 2) + 
				Math.pow((point2.getY()- point1.getY()), 2);
		return pow;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circle [AB=" + point1.getX() +", "+ point1.getY() 
		+ ", CD=" + point2.getX() +", "+ point2.getY() + "]";
	}
	

}
