import java.util.Scanner;
public class Half_pyramid2 {

    public static void main(String []args){

        System.out.println("----Half pyramid -----");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height for the pyramid ");
        int height = sc.nextInt();

        // nested loop 
        for(int i = 1; i<= height; i++){

            for(int x = height;x>=i;x--){
                System.out.print("   ");
            }
            
            for(int j = 1;j<=i;j++  ){  
               
                System.out.print(" X ");


            }

            System.out.println();
            
        }



    }
    
}
