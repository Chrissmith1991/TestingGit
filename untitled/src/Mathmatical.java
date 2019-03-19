import java.util.Scanner;

public class Mathmatical {

    public static void main(String[] args){

        //take in first name
        System.out.println("Please input your FIRST NAME: ");
        Scanner InName = new Scanner(System.in);
        String Name = InName.next();

        //take in last name
        System.out.println("Please input your LAST NAME: ");
        Scanner InLname = new Scanner(System.in);
        String Lname = InLname.next();

        //take in number one
        System.out.println("Please input Number 1: ");
        Scanner no1 = new Scanner(System.in);
        int num1 = no1.nextInt();

        //take in number two
        System.out.println("Please input Number 2: ");
        Scanner no2 = new Scanner(System.in);
        int num2 = no2.nextInt();

        System.out.println("please chose a method 1: Multiply, 2: Divide, 3: Add, 4: Minus");
        Scanner Meth = new Scanner(System.in);
        int num3 = Meth.nextInt();

        System.out.println("Your first name is: " + Name);
        System.out.println("Your last name is: " + Lname);

        if(num3 == 1){
            int MNumber = Multiply(num1,num2);
            System.out.println("The multiplication is: " + MNumber);

        }
        else if(num3 == 2){
            float DNumber = Divide(num1,num2);
            System.out.println("The Division is: " + DNumber);

        }
        else if(num3 == 3){
            int ANumber = Add(num1,num2);
            System.out.println("The Addition is: " + ANumber);

        }
        else{
            int SNumber = Minus(num1,num2);
            System.out.println("The Subtraction is: " + SNumber);

        }





    }

    private static int Multiply(int x, int y){

        int Mult = x * y;


        return Mult;

    }

    private static int Divide(int x, int y){

        int Divi = x / y;


        return Divi;

    }

    private static int Add(int x, int y){

        int Added = x + y;


        return Added;

    }

    private static int Minus(int x, int y){

        int Min = x - y;


        return Min;

    }


}
