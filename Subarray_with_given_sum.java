import java.util.*;

public class Subarray_with_given_sum{

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter size");
            int size = sc.nextInt();
            
            int out [] =new int[2]; 
            int arr [] =new int[size];
            System.out.println("Find sum :");  
            int find = sc.nextInt();
            System.out.println("enter Array values");
            for(int i=0;i<arr.length;i++)
             {
                arr[i] =sc.nextInt();
             }
        System.out.println("Finding : index for : "+find);

        for(int i=0; i<size; i++)
        {
            int sum = 0;
          for(int j=i;j<size;j++){                        
                sum = sum + arr[j];
               /// System.out.print(sum + " ");
               if(find == arr[i]){out[0] = i;}
                if(sum == find)
                {
                    //System.out.println("number found at"+i+""+j);
                     out[0] = i;
                     out[1] = j;
                }             
         
           }
           
        }//end of for loop

        System.out.println(out[0] + " " + out[1]);          
         
    }
}
