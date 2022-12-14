//display roman numbers to integer numbers

import java.util.*;

public class New{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the Roman NUmber : ");
        String str = sc.nextLine();

        char ch [] = str.toCharArray();
        int size = str.length();
        int temp[] = new int[size];

        int result =0;
        for(int i=0;i<size;i++)
        {
            switch(ch[i])
            {
                case 'I' : temp[i] = 1;
                break;

                case 'V' : temp[i] = 5;
                        break;

                case 'X' : temp[i] = 10;
                        break;

                case 'L' : temp[i] = 50;
                         break;

                case 'C' : temp[i] = 100;
                            break;

                case 'D' : temp[i] = 500;
                            break;

                case 'M' : temp[i] = 1000;
                            break;
           
                }
        }

        for(int i=1;i<size;i++)
        {
            if(temp[i-1]<temp[i])
                result -= temp[i-1];
            else 
                result += temp[i-1];
        }

        System.out.println(result+temp[size-1]);
    }
}
