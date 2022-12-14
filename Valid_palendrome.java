import java.util.*;
public class Valid_palendrome{
    public static void main(String[] args) {
        // sdhgfsdhfgshdgfhsdgfhsdg
        System.out.println("enter the stirng name :");
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();  
        String trim = str.replaceAll("\\s+", "");
        // System.out.println(trim);     
        int last = trim.length();       
        int l = last-1;
        char ch[] = new char[last];      
        for(int i=0;i<last;i++)
        {
            ch[l] = trim.charAt(i);
            l--;
        }
        String val = String.valueOf(ch);
        if(val.equals(trim))
        {
            System.out.println("palendrome");
        }
        else{
            System.out.println("not a palendrome");
        }
    }
}
