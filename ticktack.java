import java.util.Scanner;
public class ticktack{
    public static void main (String[]args){
        int n = 0;
        System.out.println(" -----ticktacktoe-----");
        for(int i = 1 ;i<=3; i++){
            for(int j = 1; j<=3; j++){
                n++;
                System.out.print(n +" ");
            }
            System.out.println();
        }
        //game 
        System.out.println(" Player 1  choose  X or O");
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.print(A);

        if(A == O){
            String B = X; 
            System.out.println();
        }
        else if(A == X ){
            String B = O; 
            System.out.println();
        }
        else{
            System.out.println(" You can only choose X or O");
        }


        for(int i = 1; i<=3 ; i++){
            for(int  j = 1 ; j<= 3;j++){
                System.out.println("Choose your possition ");
                Scanner sc2 = new Scanner(System.in);
                int  possition = sc2.nextInt();
                int p =0;

                for(int k =1; k<=3; k++ ){
                    for(int l = 1 ; l<=3 ;l++){
                       p = p + 1 ;
                        if( possition ==  p){
                            System.out.print( A +" ");
                        }
                    }
                    System.out.println();
                } 

            }
            System.out.println();
        }


                
    }
}