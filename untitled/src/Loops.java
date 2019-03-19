public class Loops {
    public static void main(String[] args){
        System.out.println("Become the Looper");
        for_loops();
        enhanced_for_loop();
        while_loop();
        do_while_loop();



    }
    public static void for_loops(){
        System.out.println("this is a FOR loop");
            for(int i = 0; i < 10; i++){
                System.out.println(i);

            }
    }

    private static void enhanced_for_loop(){
        System.out.println("This is an enhanced for loop");
        String[] words = {"KA","ME","HA","ME","HA","AA","AA","AA","AA","!"};
        for(int i = 0; i < 10; i++){
            System.out.println(words[i]);
        }

    }

    private static void while_loop(){
        System.out.println("This is a while loop");
        int n = 0;

        while(n < 10){
            System.out.println(n);
            n++;
        }

    }

    private static void do_while_loop(){
        System.out.println("This is a do while loop");
        int n = 0;
        do{
            System.out.println(n);
            n++;
        } while(n < 20);

    }
}
