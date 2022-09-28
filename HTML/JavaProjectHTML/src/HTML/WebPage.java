package HTML;
import java.util.Scanner;

public class WebPage {
    public static double computeQuotient(double n1, double n2) {
        double quotient = n1 / n2;
        return quotient;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                // Introduction. (Instructions for the User)
        System.out.print("***************************************************\n");
        System.out.print("\t\tWEBPAGE BUILDER V1.0\n");
        System.out.print("***************************************************\n");
        System.out.print("\nThis application helps you build a basic web page\nby asking you a series of questions. Just answer\neach question, and I'll populate your new web page\nwith your responses.\n");
                // Inputs are now going to be asked and stored. 
        System.out.print("\nWhat is your name? ");
        String name = sc.nextLine();
        System.out.print("How old are you? ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Where do you live? ");
        String location = sc.nextLine();
        System.out.print("When you grow up, you want to be ... ");
        String aspiration = sc.nextLine();
        int year = 0;
        year = age * 12;

        double x, y;
        System.out.print("What are your two favorite integers? ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        double quotient = computeQuotient(x,y);
        System.out.print("Here is the code for your web page:");
        System.out.print("\n<html>");
        System.out.printf("\n<head><title>%s's Web Page</title></head>", name);
        System.out.print("\n<body>");
        System.out.printf("\n<h1>Welcome to %s's Web Page</h1>", name);
        System.out.printf("\n<p>I am %d years (or %d months!) old and live in %s.</p>", age, year, location);
        System.out.printf("\n<p>When I grow up, I want to be %s.</p>", aspiration);
        System.out.printf("\n<p>My two favorite integers are %.0f and %.0f. Their quotient is %.3f.</p>", x, y, quotient);
        System.out.print("\n<p>Thank you for visiting my page!</p>");
        System.out.print("\n</body>");
        System.out.print("\n</html>");
    }

}