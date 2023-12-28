import java.util.Scanner;
public class Square {
    public static void main (String[]args){

        System.out.println("----- printing a 100 *100 square -----");

        Scanner sc = new Scanner(System.in);
        System.out.println("Set the legth");
        int l = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Set the breath");
        int b = sc2.nextInt();
        for(int i = 0 ; i<=b;i++){

            for (int j=0;j<=l;j++){
                System.out.print(" X " );
            
            }
            System.out.println();
        }
    }
    
}
