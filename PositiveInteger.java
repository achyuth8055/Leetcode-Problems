//Satish
import java.util.*;
public class PositiveInteger {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Positive Integer ");
        int num = sc.nextInt();
        int res = 1;
        int p = 1;
        while(num >0)
        {
           res = res*p;
           System.out.println("Product of number from 1 to " + p +" : "+res);
           num--;
           p++;
        }
        

    }
}
