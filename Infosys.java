import java.util.*;
public class Infosys {
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

    //    for(int i=0;i<msg.length;i++)
    //    {
    //     System.out.print(" "+res[i]);
    //    }

       //convert Integer Key to Char
       int count =0;
       char key_array [] = String.valueOf(key).toCharArray();       
       int key_res[] = new int[res.length]; 

       for(int i=1;i<=res.length;i++)
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
