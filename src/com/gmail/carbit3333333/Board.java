package com.gmail.carbit3333333;

public class Board {
	public Shape[] big = new Shape[4];

	public Board() {
		super();
	}

	public String getShape() {
		for (int i = 0; i < big.length; i++) {
			if (big[i] != null) {
				return big[i].toString();
			}
		}
		return "Empty";

	}

	public void setShape(Shape shape) {
		for (int i = 0; i < big.length; i++) {
			if (big[i] == null) {
				big[i] = shape;
				break;
			}
		}
	}

	public double getAllPerimetr() {
		double allPerimetr = 0;
		for (int i = 0; i < big.length; i++) {
			if (big[i] != null) {
				allPerimetr += big[i].getPerimetr();
			}
		}
		return allPerimetr;
	}

	public double getAllArea() {
		double allArea = 0;
		for (int i = 0; i < big.length; i++) {
			if (big[i] != null) {
				allArea = allArea + big[i].getArea();
			}
		}
		return allArea;
	}

	public Shape[] getBig() {
		return big;
	}

	public void setBig(Shape[] big) {

		this.big = big;
	}

}
