package com.helpmom.classes;

public class Expense extends Transaction {

    private final String dueDate;

    public Expense(String description, String date, double amount, String dueDate) {
        super("[DESPESA]", description, date, amount);
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return String.format("%-10s %s Vencimento: %-12s", "[GASTO]",
                super.toString(), dueDate);
    }
}