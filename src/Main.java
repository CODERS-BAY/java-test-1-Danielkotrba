import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number to Test");

        int number = scan.nextInt();
        int newNumber;
        boolean prime = true;

        for (int i = 2; i <= number / 2; i++) {
            newNumber = number % i;
            if (newNumber == 0) {
                prime = false;
            }
        }
        if (prime)
            System.out.println(number + " is a Prime Number");
        else
            System.out.println(number + " is not a Prime Number");
    }
}

