package com.syntax.class23;

public class areasOfShape {
/*Create 1 class in which create a methods that will calculate the area (volume) of 
 *Rectangle
 *Square
 *Box SA=2lw+2lh+2hw
 */
	int length;
	int width;
	int height;
	
	public void areaRectangle() {
		System.out.println("The area of a rectangle is: "+length*width);
	}
	
	public void areaSquare() {
		System.out.println("The area of a square is: "+width*width);
	}
	
	public void areaBox() {
		int box= 2*(length*width)+2*(length*height)+2*(height*width);
		System.out.println("The are of a box is: "+box);
	}
	
}
