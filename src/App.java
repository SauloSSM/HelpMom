import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Expense expense = new Expense("Energia CPFL", "07/05/2026", 100, "20/05/2026");
        System.out.println(expense);

        Revenue revenue = new Revenue("Salário", "08/05/2026", 1600, "Estágio X");
        System.out.println(revenue);
    }
}