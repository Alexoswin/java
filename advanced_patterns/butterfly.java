import java.util.Scanner;
public class butterfly {

    public static void main(String[]args){

        System.out.println("----- butterfly pattern in java -----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for the butterly");
        byte size = sc.nextByte();

        for(int i =1;i<=size;i++){

            for(int j = 1 ; j<=i;j++){

                System.out.print(" X ");
            }

            int space =  2 * (size  -i);
            for(int j = 1;j<= space;j++){
                System.out.print("   ");
            }
            
            for(int j = 1 ; j<=i;j++){

                System.out.print(" X ");
            }

            
            System.out.println();
        }

        for(int i =size;i>=0;i--){

            for(int j = 1 ; j<=i;j++){

                System.out.print(" X ");
            }

            int space =  2 * (size  -i);
            for(int j = 1;j<= space;j++){
                System.out.print("   ");
            }
            
            for(int j = 1 ; j<=i;j++){

                System.out.print(" X ");
            }

            
            System.out.println();
        }

    }
}
