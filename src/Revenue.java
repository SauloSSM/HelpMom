public class Revenue extends Transaction {

    private final String source;

    public Revenue(String description, String date, double amount, String source) {
        super("[GANHO]", description, date, amount);
        this.source = source;
    }

    @Override
    public String toString() {
        return String.format("%-10s %s Recebimento: %-12s", "[RECEITA]",
                super.toString(), source);
    }
}