import java.util.Scanner;

public class InputReader {

    public static void main(String[] args){
        System.out.println("working with arguments");
        print_arg(args);
        print_input();

    }

    private static void print_arg(String[] args){
        System.out.println(args[0]);

    }

    private static void print_input(){
        System.out.println("Please input your name: ");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.println("Your name is: " + name);


    }
}
