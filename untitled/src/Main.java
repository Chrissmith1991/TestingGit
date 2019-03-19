import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//first run
        int num;


        // Request user input
        System.out.println("Enter a Number: ");

        //create scanner object
        Scanner s = new Scanner(System.in);

        // Read next int from screen
        num = s.nextInt();

        // Display message and int
        System.out.println("The number you chose is: " + num);
    }
}
