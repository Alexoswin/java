import java.util.Scanner;
public class Switches {

    public static void main(String[] args) {
        

        System.out.println("Switches in java");

        Scanner sc = new Scanner(System.in);
        System.out.println("choose a number from 1 to 7 ");

        byte day = sc.nextByte();

        switch ((day)) {
            case 1:
                System.out.println("today is monday");
                break;
            
            case 2:
                System.out.println("today is tuesday");    
                break;
                        
            default:
                System.out.println("it can be from wednesday to sunday");
                
        }




        



    }
    
}
