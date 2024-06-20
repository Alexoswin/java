
class shapes{

    String colour;  
}

class triangle extends shapes{

     int s1 ;
     String type;

     public void pinfo(){

        System.out.println(this.colour + " " +  this.s1 + " " + this.type);
     }


}


public class c_inheritance {
    

    public static void main(String[] args) {
            triangle t1 = new triangle();
            t1.colour = "blue";
            t1.type = "right";
            t1.s1 = 34;
            t1.pinfo();

    }
}
