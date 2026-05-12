package com.helpmom.classes;

public class Transaction {

    private final String category;
    private final String description;
    private final String date;
    private final double amount;

    public Transaction() {
        this("Geral","Sem descrição", "00/00/0000", 0.0);
    }

    public Transaction(String category, String description, String date) {
        this(category, description, date,0.0);
    }

    public Transaction(String category, String description, String date, double amount) {
        this.category = (category == null || category.isBlank()) ? "Outros" : category;
        this.description = (description == null || description.isBlank()) ? "Não Informado/a" : description;
        this.date = (date == null || date.isBlank()) ? "Data Indefinida" : date;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("| %-12s | %-20s | %-10s | R$ %10.2f |",
                category, description, date, amount);
    }
}