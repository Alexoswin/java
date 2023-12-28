import java.util.Arrays;

public class Err {
 public static void main(String[]args){

    System.out.println("-----Execption handeling in java -----");

    int[] marks = {23,343,43,43,43,2165,4542,35,543};
    try{
        System.out.println(marks[15]);
    }
    catch(Exception exception){
        System.out.println("handelinf exeption");
    }


    System.out.println("executed exeption handeling");
     

 }
 


}