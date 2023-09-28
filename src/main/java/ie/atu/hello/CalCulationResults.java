package ie.atu.hello;

public class CalCulationResults {
    public final String operation;
    public final int total;

    public CalCulationResults(String operation, int total) {
        this.operation = operation;
        this.total = total;
    }

    public String getOperation() {
        return operation;
    }

    public int getTotal() {
        return total;
    }
}

