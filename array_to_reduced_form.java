
//Convert an array to reduced form
// Input:                                              EX :2 Input:
// N = 3                                               N = 5
// Arr[] = {10, 40, 20}                                Arr[] = {5, 10, 40, 30, 20}
// Output: 0 2 1                                       Output: 0 1 4 3 2
// Explanation: 10 is the least element so it
// is replaced by 0. 40 is the largest
// element so it is replaced by 3-1 = 2. And
// 20 is the 2nd smallest element so it is
// replaced by 1.


import java.util.Arrays;

public class Test{
    public static void main(String[] args) {
        
        int array [] = {10,40,20,50,100};//0,2,1,3,4
          
        int n = array.length;
        int temp[] = new int[n]; // 10,20,40
        temp = array.clone();
        Arrays.sort(temp);

        //getIndex Value and replace at smallest min value
        for(int i=0;i<n;i++)
          array[i] = getIndex(temp,array[i],n);
        

        for(int i=0;i<n;i++) 
          System.out.println(array[i]);

    }

   public static int getIndex(int array[],int num,int size)
    {
        int val=0;
        for (int i=0; i<size; i++){
            if(array[i] == num)                
                   return i;     
        }
        return val;
    }
}
