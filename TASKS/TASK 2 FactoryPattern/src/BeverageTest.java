import java.util.Scanner;

public class BeverageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.print("Do you want extras with your tea (yes/no)? ");
        String teaResponse = scanner.nextLine();
        tea.setWantsExtras(teaResponse.equalsIgnoreCase("yes"));

        System.out.print("Do you want extras with your coffee (yes/no)? ");
        String coffeeResponse = scanner.nextLine();
        coffee.setWantsExtras(coffeeResponse.equalsIgnoreCase("no"));

        System.out.println("\nMaking tea...");
        tea.finalTemplateMethod();

        System.out.println("\nMaking coffee...");
        coffee.finalTemplateMethod();
    }
}
