public class overloadong {
    

    public static void main(String[] args) {
        
        class Students{

            String name ;
            int age;
            int height;

            public void printIfo( String name  , int age  ){
                    System.out.println( age + name );
            }

            public void printIfo(int height){
                System.out.println(height);
            }

            Students(){
                this.name = name;
                this.age = age;
                this.height = height;
            }
    
        }

        // objects 
        Students A = new Students();
        A.name = " abc";
        A.age = 123;
        A.height = 234;
        A.printIfo(A.name, A.age);
        A.printIfo(A.height);

    }

}
