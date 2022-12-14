
import java.util.*;

public class New{

public static void main(String[] args) {
    

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
int array1[] = {1,2,3,0,0,0};
int array2[] = {2,5,6};
// int array2[] = {};
int merge[] = new int[6];
int m = 3;
int n = 3;


if(n == 0)
{
   for(int i=0;i<array1.length;i++)
   {
    if(array1[i] != 0)
    {
        System.out.println(array1[i]);
    }
   }
}

else {
for(int i=0; i<6; i++)
{
        if(array1[i] !=0)
            merge[i] = array1[i];
        
}


for(int i=0; i<3; i++)
{
        if(array2[i] != 0)
            merge[m+i] = array2[i];
        
}
Arrays.sort(merge);

for(int j=0; j<6; j++)
{
    System.out.print(merge[j]);
}

}//else end 
}
   
}
