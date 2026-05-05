import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Transaction transaction = new Transaction("Cartão Carrefour", "Despesa",
                "08/05/2026", 1000);
        System.out.println(transaction.getCategory());
        System.out.println(transaction.getDescription());
        System.out.println(transaction.getDate());
        System.out.println(transaction.getAmount());

        Transaction secondTransaction = new Transaction();
        System.out.println(secondTransaction.getCategory());
        System.out.println(secondTransaction.getDescription());
        System.out.println(secondTransaction.getDate());
        System.out.println(secondTransaction.getAmount());
    }
}