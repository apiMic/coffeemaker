import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        Scanner scanner = new Scanner(System.in);

        boolean shouldContinue = true;

        while(shouldContinue) {
            System.out.print("Insert command: ");
            String userChoice = scanner.nextLine();
            switch (userChoice) {
                case "Hello" -> System.out.println("Hi");
                case "Status" -> System.out.println(coffeeMachine.getStatus());
                case "Make coffee" -> coffeeMachine.makingBlackCoffee();
                case "Make white coffee" -> coffeeMachine.makingWhiteCoffee();
                case "Refill water" -> coffeeMachine.waterRefilling();
                case "Refill coffee" -> coffeeMachine.coffeeRefilling();
                case "Refill milk" -> coffeeMachine.milkRefilling();
                case "Exit" -> {
                    System.out.println("Bye");
                    shouldContinue = false;
                }
                default -> System.out.println("Wrong command");
            }
        }
    }

}