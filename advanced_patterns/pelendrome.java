
import java.util.Scanner;
public class pelendrome {
    public static void main(String[]args){
        System.out.println("------- pelendrome in java -------");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size for the pelendrome");
        byte size = sc.nextByte();
        

        if(size > 9){
            System.out.println("Size cannot be greater than 9");

        }
        else{
        for(int i = 1;i<=size;i++){
            int space = size - i;
            for(int j= space; j>=1;j--){
                System.out.print("   ");
            
            }

            for(int j = i;j>=1;j--){
                System.out.print( " "+ j + " ");
            }
            
            for(int j = 2;j<=i;j++){
                System.out.print( " "+ j + " ");
            }

            System.out.println();
        }
    }

    }
    
}
