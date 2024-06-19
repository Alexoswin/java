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
    

    //constructor 
    Student(String name , int age ){
        this.name = name ;
        this.age = age;

        System.out.println("this is a constructor");
    }
}


class Std {
    String name ;
    int age;

    public void pnt(){
System.out.println("hello ");
    }
    //coppy constructor 
    Std( Std s2){

        this.name = s2.name;
        this.age = s2.age;
    }
    Std(){

    }
}
  
public class a {
    public static void main (String args[]){

        pen pen1 = new pen();
        pen1.colour  = "blue";
        pen1.type = "gel";
        pen1.Write();


        Student one = new Student("abc", 32);
        

        one.page();
        one.pname();

        Std s1 = new Std();
        s1.name = "oswin";
        s1.age = 32;
        //coopy s1 to s2 
        Std s2  = new Std(s1);

    }
}
