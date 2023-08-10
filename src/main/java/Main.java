import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Build a scanner
    Scanner scanner =  new Scanner(System.in);

        //Prompt and store double amount
        System.out.println("Enter the amount of data: ");
        double amount = Double.parseDouble(scanner.nextLine());

        //Prompt and store String unit
        System.out.println("Enter the unit (bytes, kilobytes, megabytes, gigabytes):");
        String unit = scanner.nextLine();

        //Prompt and store download speed (in megabits
        System.out.println("Enter your download speed (in megabits per second):");
        int speed = Integer.parseInt(scanner.nextLine());

        //Build a Data object with these three values
        Data dataObject = new Data( amount , unit, speed);

        //Print out the data Object with your toString();
        System.out.println(dataObject);
    }
}
