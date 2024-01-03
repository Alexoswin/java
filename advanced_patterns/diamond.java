import java.util.Scanner;
public class diamond {
    public static void main(String[] args){
        System.out.println("------- Diamond pattern in java -----");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size for the diamond ");
        byte size = sc.nextByte();
        
        for(int i = 1 ;i<= size; i++){
            int space = size-i;
           
            for(int j = space; j>= 1; j--){
                System.out.print("   ");
            }
            
            for(int j = 1; j<= i ; j++){
                System.out.print(" * ");
                System.out.print("   ");
            }
            System.out.println();
        }

         for(int i = size - 1 ;i>= 1; i--){
            int space = size-i;
           
            for(int j = space; j>= 1; j--){
                System.out.print("   ");
            }
            
            for(int j = 1; j<= i ; j++){
                System.out.print(" * ");
                System.out.print("   ");
            }
            System.out.println();
        }


    }
    
}
