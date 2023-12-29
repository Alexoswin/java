import java.util.Scanner;
public class hollow {
    public static void main (String[]args){

        System.out.println("-----hollow rectangle pattern in java ----- ");
        Scanner sc = new Scanner(System.in);
        System.out.println("length for the rectangle ");
        int L =sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter the breath for the rectangle");
        int B = sc2.nextInt();


        // outer loop

        for(int i = 1;i<=L;i++){
            // inner loop 
            for(int j =1;j<=B;j++){

                if(i == L || j ==B ||j==1||i==1){
                    System.out.print(" X ");
                }
                else{
                    System.out.print("   ");
                }

            }
            System.out.println();

        }
    

    }
}
 