import java.util.*;

public class MedianOfTwoArrays{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr1_size,arr2_size;
        
        System.out.println("array 1 size");
        arr1_size = sc.nextInt(); // size
        int arr1[] = new int[arr1_size];
        System.out.println("enter array 1 elements");
        //scanning array elements
        for(int i=0;i<arr1_size;i++)
            arr1[i] = sc.nextInt();
        
        //scanning array 2
        System.out.println("array 2 size");
        arr2_size = sc.nextInt();
        int arr2[] = new int[arr2_size];
        for(int i=0;i<arr2_size;i++)
            arr2[i] = sc.nextInt();
        

        int size = arr1.length + arr2.length;
        
        int array[] = new int[size];

        for(int i=0;i<arr1_size;i++)
            array[i] = arr1[i];
        

        for(int i=0;i<arr2_size;i++)
            array[arr1_size + i] = arr2[i];
                

        for(int i=0;i<size;i++)
             {
                int temp;
                for(int j=i+1;j<size;j++)
                {
                    
                    if(array[i]>array[j])
                    {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                                   
                }
             }
        //merged arrray
        for(int i=0; i<size; i++)
            System.out.print(array[i] + " ");
        



        int mid = (int)array.length/2;
        
         if(array.length%2 != 0)
        {
            System.out.println("\n");
            System.out.println(array[mid]);
        }

        else if(array.length%2 ==0)
        {
            System.out.println("\n");
            System.out.println("\n"+ (float) (array[mid-1] + array[mid])/2.0);
        }

    }
}
