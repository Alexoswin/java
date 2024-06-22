/**
 * c_inheritance
 */

 class square{

    int length;

    
    public void Area(int length){
        
        System.out.println(length * length);
    }
    
    // constructor
    square(int  length){

        this.length = length;
    }
    
 }

class triangle extends square{

    int height ;

    
    public void Area(int height , int length){
        System.out.println(0.5 * length * height);
    }
    triangle(int length, int height){
        super(length);
        this.height = height;
        
    }
}


class rectangle extends triangle {
    public void Area(int length , int breath){
    System.out.println(length* breath);
}
    rectangle(int length, int height){

        super(length, height);
    }
}

public class c_inheritance {


     public static void main (String [] args){

        System.out.println("multi level ingeitance ");


        square one = new  square(6);
        one.Area(one.length);

        triangle t1 = new triangle(6, 2);
        t1.Area(t1.length, t1.height);

        rectangle r1 = new rectangle(13, 2);
        r1.Area(r1.length, r1.height);
     }
}