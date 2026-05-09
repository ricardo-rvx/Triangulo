package infrastructure;

import java.util.Scanner;

import adapters.iInputReader;

public class ConsoleInputReader implements iInputReader{
	private final Scanner sc;
	public ConsoleInputReader(Scanner scanner) {
		this.sc = scanner;
	}

	@Override
	public double[] readNextLine() {
		if (!sc.hasNextDouble()) {
            return null;
        }
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double angulo = sc.nextDouble();
        return new double[]{a, b, angulo};
	}

}
