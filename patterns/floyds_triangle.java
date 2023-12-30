import java.util.Scanner;
public class floyds_triangle {
    
    public static void main (String[]args){
        System.out.println("-----Floyd's Triangle -----");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height for the triangle ");
        byte height = sc.nextByte();
        int num = 0;

        for(int i =1 ; i<=height; i++){
            for(int j = 1 ; j<=i; j++){
                num++;
                System.out.print(" "+ num + " ");
            }
            System.out.println();
        }


    }
}
