package infrastructure;

import adapters.iOutputWriter;

public class ConsoleOutputWriter implements iOutputWriter {
    @Override
    public void writeResult(double area) {
        System.out.printf("%.4f\n", area);
    }
}
