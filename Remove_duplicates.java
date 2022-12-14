import java.util.*;
public class Remove_duplicates {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count =0;
        int array [] = new int[size];
       
        
            for(int i=0;i<size;i++){
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            for(int i=1;i<size;i++){
                
                if(array[i] > array[i-1])
                {
                    array[count++] = array[i];
                }
            }

            for(int i=0;i<size;i++)
            {
                System.out.println(array[i]);
            }

    }
    
}
