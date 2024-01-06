import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        System.out.println("Bit manipulation in Java");

        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for function one ");
        System.out.println("Press 2 for function two");
         System.out.println("Press 3 for function clear");
        byte number = sc.nextByte();
        if (number == 1) {
            One();
        } else if (number == 2) {
            two();
        }
        else{
            clear();
        }
    }

    public static void One() {
        // Bit masking
        int n = 5;
        int pos = 3;
        int bitmask = 1 << pos;

        if ((bitmask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }

    public static void two() {
        System.out.println("");

        int n =5 ;
        int pos = 1;
        int bmasks = 1<<pos;
        int new_number = bmasks | n;
        System.out.println(new_number);



    }

    public static void clear(){
            int n= 5;
            int pos = 2 ;
        int bitmask = 1<<pos;
        int notbitmask = ~(bitmask);

        int new_number= notbitmask & n ;
        System.out.println(new_number);
    }
}
