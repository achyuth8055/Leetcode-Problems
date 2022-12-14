//Check if two arrays are equal or not GFG problem

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        int c = 0;
        for(int i =0 ;i<N;i++)
        {
            if(A[i]==B[i])
                c = c+1;
            else 
                c=c-1;
        }
        
        if(c==N)
            return true;
        else 
            return false;
        
         
    }
}
