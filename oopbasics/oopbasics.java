
public class oopbasics {
    
    //class car 
   
    public static void main(String[] args) {


        class Cars {
            String colour;
            String brand;
            String type;
            int torque;
            int rpm; 
    
    
            public void power(){
                int n = this.torque;
                int m = this.rpm;
                System.out.println(" power :"+ (n * m));
            }
            Cars(){
                System.out.println("Constructer called ");
            }
        }

        // Create an instance of oopbasics
    
        System.out.println("-- oop in java");

        // objects
        Cars A = new Cars();
        A.brand = "tata";
        A.colour = "blue";
        A.type = "SUV";
        A.torque = 20;
        A.rpm = 100;
        A.power();

    }


    // class 2
    class Students{


        String name;
        int  age;
        String  parentName; 

        public void Aages() {
            int a = this.age;
            System.out.println(a);

        }
        //constructor 
        Students(  String name,
        int  age,
        String  parentName){

            this.name = name;
            this.age = age;
            this.parentName = parentName;
            int a = this.age;
            System.out.println(a);
        }

      
    }

    // object 
    Students A = new Students("Abc", 23,"Def");
    


}
