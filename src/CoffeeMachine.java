import java.util.Random;

public class CoffeeMachine {

    Ingredient coffee;
    Ingredient milk;
    Ingredient water;
    int maxCoffee = 2000;
    int maxMilk = 60;
    int maxWater = 1500;


    public CoffeeMachine() {

        int coffeeAmount = getRandomAmount(maxCoffee);
        coffee = new Ingredient(IngredientNames.COFFEE, coffeeAmount);

        int milkAmount = getRandomAmount(maxMilk);
        milk = new Ingredient(IngredientNames.COFFEE, milkAmount);

        int waterAmount = getRandomAmount(maxWater);
        water = new Ingredient(IngredientNames.COFFEE, waterAmount);
    }

    private int getRandomAmount(int maxAmount) {
        Random random = new Random();
        return random.nextInt(0, maxAmount + 1);
    }

    public String getStatus() {

        return (String.format("%s: %s\n%s: %s\n%s: %s\n", IngredientNames.COFFEE, coffee.amount, IngredientNames.MILK, milk.amount, IngredientNames.WATER, water.amount));
    }

    public void makingBlackCoffee() {
        grinding();
        heating();
        pouringWater();
        System.out.println("Coffee ready.");
    }

    public void makingWhiteCoffee() {
        grinding();
        heating();
        pouringWater();
        pouringMilk(50);
        System.out.println("Coffee ready.");
    }

    private void grinding() {
        try {
            System.out.printf("Grinding...\n");
            Thread.sleep(5 * 1000);
            coffee.amount -= 11;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void heating() {
        try {
            System.out.printf("Heating water...\n");
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void pouringWater() {
        try {
            System.out.printf("Pouring water...\n");
            Thread.sleep(3 * 1000);
            water.amount -= 170;
            System.out.println("Pouring water...\n");
            Thread.sleep(3 * 1000);
            water.amount -= 30;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void pouringMilk(int milkDose) {
        try {
            System.out.printf("Pouring milk...\n");
            Thread.sleep(milkDose * 100);
            milk.amount -= milkDose;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waterRefilling() {
        water.amount += 500;
        if (water.amount > maxWater) { water.amount = maxWater; }
    }

    public void milkRefilling() {
        milk.amount += 500;
        if (milk.amount > maxMilk) { milk.amount = maxMilk; }
    }


    public void coffeeRefilling() {
        coffee.amount += 500;
        if (coffee.amount > maxCoffee) { coffee.amount = maxCoffee; }
    }





}
