import java.util.Scanner;
import adapters.*;
import useCase.*;
import infrastructure.*;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        iInputReader reader = new ConsoleInputReader(sc);
        iOutputWriter writer = new ConsoleOutputWriter();
        iCalcularArea useCase = new calcularArea();
        
        TrianguloController controller = new TrianguloController(reader, writer, useCase);
        System.out.println("Utilize o '.'(ponto) como separador de interiro para decimal.");
        controller.run();

        sc.close();
	}

}
