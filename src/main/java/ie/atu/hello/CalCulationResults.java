package ie.atu.hello;

public class CalCulationResults {
    private final String operation;
    private final int total;

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

