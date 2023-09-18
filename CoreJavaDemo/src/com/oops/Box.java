package com.oops;
/**
 * Create a class Box with following data members
 * height, width and length of type int
 * Create methods
 * initialize(int h, int w, int l) => to initialize with, height and length 
 * and no return type
 * volume() => that calculates volume of box and returns the data
 * display() => displays the dimensions of a box
 * w x h x l
 * 2 x 3 x 5
 */
public class Box {

	int width, height, length;
	void initialize(int w, int h, int l)
	{
		height=h;
		width = w;
		length = l;
	}
	int volume()
	{
		return height*width*length;
	}
	void display()
	{
		System.out.println(width+"x"+height+"x"+length);
	}
}
