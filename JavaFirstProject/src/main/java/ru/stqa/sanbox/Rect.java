package ru.stqa.sanbox;

public class Rect {
	
	public double a;
	public double b;
	
	public Rect(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public void area() {
		System.out.println(this.a * this.b);
	}
	

}
