package com.Quize_1;

public class Box {
	
	//Instance Variable
	double height;
	double weigth;
	double depth;

	Box(double height, double weigth, double 		depth) {
		this.height = height;
		this.weigth = weigth;
		this.depth = depth;

	}

	void displayVol() {
		// Logic of volioum is Height * Depth * Weight.

		double vol = height * weigth * depth;
		System.out.println("The Volioum is : " + vol);
	}

}
