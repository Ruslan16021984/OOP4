package com.gmail.carbit3333333;

public class Triangle extends Shape{
	private Point point1;
	private Point point2;
	private Point point3;
	

	public Triangle(Point point1, Point point2, Point point3) {
		super();
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
	

	/**
	 * @return the point1
	 */
	public Point getPoint1() {
		return point1;
	}

	/**
	 * @param point1 the point1 to set
	 */
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	/**
	 * @return the point2
	 */
	public Point getPoint2() {
		return point2;
	}

	/**
	 * @param point2 the point2 to set
	 */
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	/**
	 * @return the point3
	 */
	public Point getPoint3() {
		return point3;
	}

	/**
	 * @param point3 the point3 to set
	 */
	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	@Override
	public double getPerimetr() {
		double perimetr;
		double a = Math.sqrt(getPow(point2.getX(), point1.getX())+getPow(point2.getY(), point1.getY()) );
		double b = Math.sqrt(getPow(point3.getX(), point2.getX())+getPow(point3.getY(), point2.getY()) );
		double c = Math.sqrt(getPow(point3.getX(), point1.getX())+getPow(point3.getY(), point1.getY()) );
		perimetr = a + b + c;
		return perimetr;
	}

	@Override
	public double getArea() {
		double area = Math.abs(((point1.getX()- point3.getX())*
				(point2.getY()- point3.getY())- (point2.getX()- point3.getX())*
				(point1.getY()- point3.getY()))/2);
		return area;
	}
	private double getPow(double point1, double point2) {
		double pow = Math.pow((point2-point1), 2);
		return pow;
		
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Triangle "
				+ "[AB=" + point1.getX() +", "+ point1.getY()
				+ ", BC=" + point2.getX() +", "+ point2.getY() 
				+ ", AC=" + point3.getX() +", "+ point3.getY() + "]";
	}
	

}
