import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Transaction transaction = new Transaction("Cartão Bradesco/ Crédito", "Despesa",
                "08/05/2026", 1000);
        System.out.println(transaction);

        Expense expense = new Expense("Cartão Polo", "Despesa", "06/05/2026", 545, "20/05/2026");
        System.out.println(expense);

        Revenue revenue = new Revenue("Cartão Caixa", "Receita", "08/05/2026", 1600, "Estágio X");
        System.out.println(revenue);
    }
}