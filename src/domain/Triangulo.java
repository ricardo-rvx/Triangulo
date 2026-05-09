package domain;


public class Triangulo{
	
	
	private double a;
	private double b;
	private double rad;
	
	public double getA() {return a;}

	public double getB() {return b;}

	public double getRad() {return rad;}

	public Triangulo(double ladoA, double ladoB, double radiano) {
		a = ladoA;
		b = ladoB;
		rad = radiano;
	}

}
