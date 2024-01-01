import java.util.Scanner;
public class rombus3 {

    public static void main (String[]args){

        System.out.println("----- number  pyramid -----");
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the size for the pyramid");

        byte size = sc.nextByte();
    
        int number = 0;
        for(int i = 1; i<= size; i++){
            int space = size - i;   
            number++;
            
            

            for(int j = space ; j>=1; j--){
                System.out.print("   ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print(" "+ number + " ");
                System.out.print("   ");



            }
            System.out.println();
        }





    }
    
}
