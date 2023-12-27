import java.util.Scanner;

public class Maths{
    public static void main(String[] args){

        System.out.println("MATH");
        System.out.println(Math.min(34,23));
         System.out.println(Math.max(443,54));
         System.out.println((int)(Math.random()*100));

        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter age : ");
        int age = sc.nextInt();
        System.out.println(age);


           Scanner ad = new Scanner(System.in);
       
        System.out.println("are you  a adult ");
        Boolean adult = ad.nextBoolean();
        System.out.println("you are a adult ? " + adult );


        if(age>100){
            System.out.println("invalid age");
        }
        else if (age<0){
            System.out.println("age cannot be negative");
        }
        else{
            System.out.println("age is correct");
        }
        
        

    }
}