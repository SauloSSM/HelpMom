public class Expense extends Transaction {

    private String dueDate;

    public Expense(String category, String description, String date, double amount, String dueDate) {
        super(category, description, date, amount);
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "[Expense] " + super.toString() + " | Vence em: " + dueDate;
    }
}
