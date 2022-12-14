// Input:
// N = 3
// Arr[] = {1, 3, 3}
// Output: 3 2
// Explanation: Repeating number is 3 and 
// smallest positive missing number is 2.
  
// Example 2
// Input:
// N = 2
// Arr[] = {2, 2}
// Output: 2 1
// Explanation: Repeating number is 2 and 
// smallest positive missing number is 1.


import java.util.*;
class Find_Missong_And_Repeating_Number{



    public static void main(String[] args) {
        


        int arr[] = {1,3,3,3};
        int n = 4;
        int count = 0;
        int res[] = new int[2];
        for(int i=0;i<n;i++)
        {
            count = 1;
            
            for(int j=i+1;j<n;j++)
            {
               
                if(arr[i] == arr[j] && arr[j] != -1)
                    {
                       
                         res[0] = arr[i];
                         res[1] = count++;
                         arr[j] = -1;
                        
                    }
            }
            
            if(count > 1)
            {
                res[1] = res[1]+1;
                System.out.println(res[0] +" "+ res[1]);
            }
        } //System.out.println(res[0] +" repeated "+ res[1]+" time"); 
       


    }
}




