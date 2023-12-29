  import java.util.Scanner;

public class Inverted_half_pyramid {
  
    public static void main(String[]args){
        System.out.println("-----half pyramid-----");

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height for the pyramid");
        int height = sc.nextInt();
        

        for(int i=height;i>=1;i--){

            for(int j=1;j<=i;j++){
                System.out.print(" X ");
            }
            System.out.println();
        }


        
        
    }
    
}

