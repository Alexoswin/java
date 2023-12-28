public class Loops2 {
    
    public static void main (String[]args){
        System.out.println("--- while and do while loops in java ---");

                
        
        
        System.out.println("----- while looop -----");

        int i = 0;
        while(i <10){
            System.out.println(10*i);
            i++;
        }
        
        System.out.println("----- do while looop -----");

        i = 1;

        do{
            System.out.println(20*i);
            i ++;
        }
        while(i==0);


         System.out.println("---- Break and continue in loops----");
         int x = 0;
         while (true){
            System.out.println(x);
            x = x+1;
            if(x>32){
                break;
            }
         }

         int y = 0;
         while (true){
            System.out.println(y);
            y = y+1;
            if(y==32){
                continue;
            }
            else if (y ==35){
                break;
            }
            
         }

    }
}
