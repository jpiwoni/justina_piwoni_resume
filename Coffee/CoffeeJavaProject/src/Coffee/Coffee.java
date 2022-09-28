package Coffee;
import java.util.Scanner;

public class Coffee {
    // Heading
    public static void printHeading() {
        System.out.print("*************************************\n");
        System.out.print("STARLIGHT COFFEE POINT-OF-SALE SYSTEM\n");
        System.out.print("*************************************\n");
    }
    // Coffee Choice (Choice of Beverage)
    public static int coffeeChoice(Scanner sc) {
        System.out.println("What kind of coffee do you want? ");
        System.out.println("1. Americano");
        System.out.println("2. Italiano");
        System.out.println("3. Espresso");
        System.out.println("4. Cappuccino");
        System.out.print("Enter the number of your choice: ");
        int response = sc.nextInt();
        return response;
    }
    // Size Choice
    public static int sizeChoice(Scanner sc) {
        System.out.println("What size do you want? ");
        System.out.println("1. Tall");
        System.out.println("2. Grande");
        System.out.println("3. Venti");
        System.out.print("Enter the number of your choice: ");
        int response = sc.nextInt();
        return response;
    }
    // Tip Choice
    public static int tipChoice(Scanner sc) {
        System.out.println("What size tip would you like to leave? ");
        System.out.println("1. Good serve - 10%");
        System.out.println("2. Great service - 15%");
        System.out.println("3. Outstanding service - 20%");
        System.out.print("Enter the number of your choice: ");
        int response = sc.nextInt();
        return response;
    }
    // Printing of the Bill
    public static void printBill(String name, double bevCost, double clubDiscount, double tipAmount, double taxes, double total) {
        System.out.printf("Here is your bill, %s:", name);
        System.out.printf("%-20s%10.2f\n", "Beverage", bevCost);
        System.out.printf("%-20s%10.2f\n", "Club Discount", clubDiscount);
        System.out.printf("%-20s%10.2f\n", "Tip Amount", tipAmount);
        System.out.printf("%-20s%10.2f\n", "Taxes", taxes);
        System.out.printf("%-20s%10.2f\n", "Total", total);
    }
    // Putting it all together
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coffeeChoice = 0;
        int sizeChoice = 0;
        int tipChoice = 0;
        // Prints the header
        printHeading();
        String name = sc.nextLine();
        // The price of the coffee that was chosen
        coffeeChoice = coffeeChoice(sc);
        if (coffeeChoice == 1) {
            // Continue Code (Americano = $2.25)
        } else if (coffeeChoice == 2) {
            // Continue Code (Italiano = $2.75)
        } else if (coffeeChoice == 3) {
            // Continue Code (Espresso $3.50)
        } else if (coffeeChoice == 4) {
            // Continue Code (Cappuccino $3.75)
        }
        //The upcharge of the size that was chosen
        sizeChoice = sizeChoice(sc);
        if (sizeChoice == 1) {
            //Continue Code (Tall = no upcharge)
        } else if (sizeChoice == 2) {
            // Continue Code (Grande = 20% upcharge)
        } else if (sizeChoice == 3) {
            // Continue Code (Venti = 40% upcharge)
        }
        System.out.print("\nHow many extra shots of espresso would you like? ");
        int shots = sc.nextInt();
        sc.nextLine();
        // Continue Code ($0.50 per shot)
        System.out.print("\nAre you a member of Starlight Stars (y or no)? ");
        String member = sc.nextLine();
        // Continue Code (10% discount applied after rest of bill is calculated) (Need to figure out code in regards to y or n)
        // The decision on the choice of tip
        tipChoice = tipChoice(sc);
        if (tipChoice == 1) {
            // Continue Code (10% tip)
        } else if (tipChoice == 2) {
            // Continue Code (15% tip)
        } else if (tipChoice == 3) {
            // Continue Code (20% tip)
        }
        // Code still needed (Calculate taxes and final total)
        // Prints final bill
        //printBill(name, bevCost, clubDiscount, tipAmount, taxes, total);
        // Finishes program
        //System.out.printf("Thank you for choosing Starlight Coffee!");
    }
}