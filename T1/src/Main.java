import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("hello world ");

        byte age = 13;
        String name = "OswinAlex";

        System.out.println(name);
        System.out.println(age);

            // primitive  types

        //byte -1  -127 to 128
        //short -2
        //int -4  1,2,3,4
        //long -8
        //float -4  43.433
        //double-8
        //char -2   a/b/c/d
        //boolean -1 true/false

            // non primitive types

                // string

        char symbol = '@';
        long phone = 992423423423324L;
        float pie_value = 3.14F;
        boolean adult = true;


        System.out.println(name.length());
        System.out.println(name.charAt(5));
        String namex =  name.replace("O", "A");
        System.out.println(namex);;


        String name1 = "ssajfo";
        String name2 = "aDASFs";
        String name3 = name1 + " and " + name2;
        System.out.println(name3);
        System.out.println(name3.substring(6,10));

            // declaring arry to store marks

                int [] marks = new int[4];
                marks[0] = 98;
                marks[1]=43;
                marks[2]=43;
                 marks[3]=413;

                System.out.println(marks[0] + ", " + marks[1]);

                Arrays.sort(marks);
                 for (int i = 0; i < marks.length; i++) {
                      System.out.print(marks[i] + " ");
        }

                 int[] new_marks = { 23, 32, 323, 23, 12, 112};
                   System.out.println("New marks are");
                 for (int x = 0; x< new_marks.length;x++ ){

                     System.out.println(new_marks[x]+" ");
                 }

        //// 2D array in java

        System.out.println("new 2d array in java ");
        int [][] final_marks = {{43,43,12,543},{23,23,54,21}};
                 System.out.println(final_marks[1][3]);



                 float fs = 42.32f;
                 int s = 20 + (int)fs;

                 System.out.println(s);


    }

}