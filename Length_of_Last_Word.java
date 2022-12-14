import java.util.*;

public class  Length_of_Last_Word{

    public static void main(String[] args) {
             
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the message :");
                String msg = sc.nextLine().trim();
                int len = msg.length();
                int count =0;
                for(int i=len-1;i>-0;i--)
                {
                        if(msg.charAt(i) == ' ' && count == 0)
                            continue;
                        if(msg.charAt(i) == ' ')
                            break;
                        else
                            count++;
                }
              System.out.println(count); 
    }

}


