import java.util.Scanner;
public class Half_pyramid {
    public static void main(String[]args){
        System.out.println("-----half pyramid-----");

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height for the pyramid");
        int height = sc.nextInt();
        

        for(int i=1;i<=height;i++){

            for(int j=1;j<=i;j++){
                System.out.print(" X ");
            }
            System.out.println();
        }


        
        
    }
    
}
