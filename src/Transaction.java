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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}