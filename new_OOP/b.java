package new_OOP;

class Students{

    String name ;
    int  age;
        //overloading the return type or arguments should be different in these functions 

        Students(String name , int age){
            this.age = age ;
            this.name = name ;
        }

        public void printinfo(String name){
            System.out.println(name);
        }
        public void printinfo(int age ){
            System.out.println(age);
        }
        public void printinfo(String name , int age ){

            System.out.println(name + age );
        }
}

public class b {

    //
    public static void main (String []args){
        System.out.println("polymorphism  overloding (compile time )and over riding");
        Students s1 = new Students("oswin", 21);

        s1.printinfo(s1.age);
        s1.printinfo(s1.name);
        s1.printinfo(s1.name, s1.age);
    }
}
