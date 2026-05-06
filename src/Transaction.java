public class Transaction {

    private String category;
    private String description;
    private String date;
    private double amount;

    public Transaction() {
        this("Cartão","Despesa/Receita", "05/05/2026", 0);
    }

    public Transaction(String category, String description, String date) {
        this(category, description, date,0);
    }

    public Transaction(String category, String description, String date, double amount) {
        this.category = category;
        this.description = description;
        this.date = date;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction {" +
                "category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                '}';
    }
}