abstract class vehical{

    String colour;
    int weight;
    int speed ;

    public void speed_w(int speed, int weight){

        System.out.println(speed + " " + weight);
    }

    vehical(String colour , int weight , int speed){

        this.colour = colour ;
        this.speed = speed ;
        this.weight = weight ;

    }

    
}

class car extends vehical{

    String type;

    public void pl(){
        System.out.println(type + speed);
    }
    car(String type , String colour, int weight, int speed){
      
        super(colour, weight, speed);
        this.type = type ;
    }
}


public class abstraction {
    

    public static void main (String []args){

        System.out.println("Abstraction lass in java");

        car c = new car("Sd", "SDa", 032, 032);
        c.speed_w(c.weight, c.speed);

        c.pl();
    }
}
