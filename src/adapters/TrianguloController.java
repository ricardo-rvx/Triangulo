package adapters;

import domain.Triangulo;
import useCase.iCalcularArea;

public class TrianguloController {
	private final iInputReader inputReader;
    private final iOutputWriter outputWriter;
    private final iCalcularArea iCalcularArea;
	public TrianguloController (iInputReader inputReader, iOutputWriter outputWriter, iCalcularArea iCalcularArea) {
		this.inputReader = inputReader;
		this.outputWriter = outputWriter;
		this.iCalcularArea = iCalcularArea;
    }
	
	public void run() {
        while (true) {
            double[] inputs = inputReader.readNextLine();
            
            if (inputs == null || (inputs[0] == 0.0 && inputs[1] == 0.0 && inputs[2] == 0.0)) {
                break;
            }

            Triangulo tri = new Triangulo(inputs[0], inputs[1], inputs[2]);
            double area = iCalcularArea.areaTriagulo(tri);
            outputWriter.writeResult(area);
        }
    }

}
