import java.util.Scanner;
import java.util.Arrays;
public class Loops {


    public  static void main (String[] args){

        System.out.println("----loops in java----");
        
        Scanner sc  =new Scanner(System.in);

        System.out.println("enter a number  ");
        byte x  = sc.nextByte();
        for (int i = 1; i<=10;i++){
            System.out.println(x + " * " +i +" = "+ x*i);
        }

           int[] list =new int[20];
     
    for(int i = 0; i<list.length;i++){
        Scanner ss = new Scanner(System.in);
        System.out.println("enter the element for the " + i + " index position in the list " );
        list[i] = ss.nextInt();
    }

    System.out.println("printing the elements of the list ");

    for(int b =0 ;b <list.length;b++){

        System.out.println(list[b]);
    }

    }

 

    
}
