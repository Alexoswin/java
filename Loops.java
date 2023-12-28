import java.util.Scanner;
public class Loops {


    public  static void main (String[] args){

        System.out.println("----loops in java----");

        Scanner sc  =new Scanner(System.in);

        System.out.println("enter a number  ");
        byte x  = sc.nextByte();
        for (int i = 1; i<=10;i++){
            System.out.println(x + " * " +i +" = "+ x*i);
        }

        


    }
    
}
