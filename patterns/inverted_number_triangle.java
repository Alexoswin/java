import java.util.Scanner;
public class inverted_number_triangle {
    
 
        public static void main(String[]args){
            System.out.println("----- Inverted  Number triangle pattern -----");
    
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter the height for the triangle  ");
            Byte height = sc.nextByte();
    
    
            for(int i = height;i>=0;i--){
        
                for(int j = 1; j<=i; j++){
                    System.out.print(" "+ j +" ");
                }
                System.out.println();
            }
        }
    
}
