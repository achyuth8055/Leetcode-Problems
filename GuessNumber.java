import java.util.*;
public class GuessNumber {
    //enter number between 1 - 100
    // guess number ip 50
    //increase / decrease according to random stored number
    //if found correct guess
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number Between 1 - 100 ");
        double rand = Math.random()*100;
        //System.out.println((int)rand);
       int r = (int) rand;
       int count=1;
       int found = 0;     
        do{
            System.out.println("Guess The Number :");
            int guess = sc.nextInt();                
                if(guess==r){
                    System.out.println("You have found the number after " +count+" guess.");
                    found = 1;
                }
                else if(guess > r)
                    System.out.println("Reduce the guess ");
                else
                    System.out.println("Increase the Guess ");
                    count++;   
        }
        while(found==0);            
    }
}
