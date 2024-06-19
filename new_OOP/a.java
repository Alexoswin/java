class pen{

    String colour ;
    String type;
    
    public void Write(){
        System.out.println("this is a " + this.colour +" " + this.type +" pen");
    }
    

}

class Student{

    String name;
    int  age;

    public void pname(){

        System.out.println(this.name);
    }
    public void page(){
        System.out.println(this.age);
    }
}
public class a {
    public static void main (String args[]){

        pen pen1 = new pen();
        pen1.colour  = "blue";
        pen1.type = "gel";
        pen1.Write();


        Student one = new Student();
        one.name = "oswin"; one.age = 21;

        one.page();
        one.pname();
    }
}
