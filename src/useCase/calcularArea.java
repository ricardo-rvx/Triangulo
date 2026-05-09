package useCase;

import domain.Triangulo;

public class calcularArea implements iCalcularArea{	

	private static final double PI = 3.14159265358979323846;

	@Override
	public double areaTriagulo(Triangulo triangulo) {
		double radiano = triangulo.getRad() * (PI/ 180.0);
		return 0.5 * triangulo.getA() * triangulo.getB() * Math.sin(radiano);
	}

}
