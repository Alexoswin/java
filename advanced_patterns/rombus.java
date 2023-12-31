import java.util.Scanner;
public class rombus {

    public static void main(String [] args){
         
        System.out.println("----- Rombus pattern using java -----");
        System.out.println();
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size for the rombus");

        byte size = sc.nextByte();

        int space = size;
        for(int i = 0 ; i<= size; i ++){
             
            for(int j = space; j>= 1; j--){
                System.out.print("  ");
                
            }
            space--;

            for(int j = 0; j<= size ; j ++){
                System.out.print(" X ");
            }
            System.out.println();

        }


    }
    
}
