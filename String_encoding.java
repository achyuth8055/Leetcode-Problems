//Imput message : start
// Input Key : 1234
//output : 21 22 4 22 21
import java.util.*;
public class String_encoding {
 //string Encoding using an integer value Infosys Question
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Message :");
        String message = sc.nextLine();
        char msg[] = message.toCharArray();
        System.out.println("Enter Key :");
        int key = sc.nextInt();
        int x =0;
        int res[] = new int[msg.length];            
        for(int k=0; k<msg.length;k++)
        {             
               for(int i=97;i<=122;i++)
               {
                   if(msg[k] == (char)i)
                   {
                      res[x] = i - 96; 
                      x++;
                   }        
           }
       }
       for(int i=0;i<msg.length;i++)
       {
        System.out.print(" "+res[i]);
       }
       System.out.println(" ");
       int count =0;
       //convert Integer Key to Char
       char key_array [] = String.valueOf(key).toCharArray();       
    //    System.out.println("\n"+key_size);
        int key_res[] = new int[res.length]; 

       for(int i=1;i<res.length+1;i++)
       {
            if(count == key_array.length)
            {
             count = 0;              
             key_res[i-1] = key_array[count];
             count++;                     
            }           
            else {
                key_res[i-1] = key_array[count];            
               count++;
            }
       }
      
    //    System.out.println("res is type of" +  ((Object)res).getClass().getSimpleName());

       for(int i=0;i<res.length;i++)
       {               
            int a =  Integer.parseInt(String.valueOf((char)key_res[i]));
            int b =  Integer.parseInt(String.valueOf(res[i]));
            System.out.print(" " + (a + b));
       }

    }
    
}
