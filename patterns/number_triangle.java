 import java.util.Scanner;
public class number_triangle {
    public static void main(String[]args){
        System.out.println("----- Number triangle pattern -----");

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the height for the triangle  ");
        Byte height = sc.nextByte();


        for(int i = 1;i<=height;i++){
    
            for(int j = 1; j<=i; j++){
                System.out.print(" "+ j +" ");
            }
            System.out.println();
        }
    }
}
