interface shapes{

    String length = "sda";
    
    public void  area();
}

/**
 * colour 
 String colour = " blue";
 
 public void  pcolour();*/
 interface colour{
    String colour = " blue";

    public void  pcolour();

    

}

class triangle implements shapes ,colour {

    public void  area(){
        System.out.println( length);
    }
    public void pcolour(){
        System.out.println(colour);
    }
}


public class intfer {


    public static void main (String []args ){
        System.out.println(" INTERFACES IN JAVA ");
        triangle t = new triangle();
        t.area();
        t.pcolour();

    }
    
}
