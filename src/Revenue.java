public class Revenue extends Transaction {

    private String source;

    public Revenue(String category, String description, String date, double amount, String source) {
        super(category, description, date, amount);
        this.source = source;
    }

    @Override
    public String toString() {
        return "[Revenue] " + super.toString() + " | Recebe de: " + source;
    }
}