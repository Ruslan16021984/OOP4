package com.gmail.carbit3333333;

import java.util.Arrays;

public class Board {
	public Shape[] big = new Shape[4];

	public Board() {
		super();
	}

	public void getShape() {
		for (int i = 0; i < big.length; i++) {
			System.out.println(big[i]);
		}

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
	public void deleteShape(Shape shape) {
		for (int i = 0; i < big.length; i++) {
			if(big[i]== shape) {
				big[i] = null;
			}
		}
	}

	public Shape[] getBig() {
		return big;
	}

	public void setBig(Shape[] big) {

		this.big = big;
	}

}
