import java.util.Scanner;


public class Main {

    //Create a Scanner object for reading the command line (remember to import the Scanner class from the util library:

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please type your name:");


        //Declare a String variable, name and assign it the content of the scanner's call to nextLine().
        String name = scanner.nextLine();

        //2.e: Print the name of the user in a greeting, followed by the message "Please type your age"
        System.out.println("Welcome "+name);
        System.out.println("Please type your age;");

        //2.f: Declare another variable of type int, age and assign it the value returned by the nextInt method of the Scanner object.
        int age = scanner.nextInt();

        //2.g: Print the value the user writes (the age variable)
        System.out.println("Your age; "+ age);

        //2.h: Declare a third variable of type int. To this variable, assign the calculated number of years until the user can retire. You may assume retirement starts at 67 years. Print the result.
        int yearsB4Retirement=(67-age);
        System.out.println("You have "+yearsB4Retirement+" years before your retirement");


    }
}