//Istanbul =1000
//Berlin =1500
//Paris=2000
//Bengaluru=2500
//Enter Balance : 2500 
//display : all 4 city nad reduct the selected city-current balance
//Ex : selected city 4 2500-2500 and balance amount = 0


import java.util.*;
public class Solution{
  static int bal;
  static int Balance(int res,int currentBalance)
  {
    if(res ==1)
    {
      System.out.println("Your Balance Money Is : "+ (currentBalance-1000) +"Have A nice Flight Trip."); 
    }
    else if(res ==2)
    {
      System.out.println("Your Balance Money Is : "+ (currentBalance-1500) +"Have A nice Flight Trip."); 
    }
    else if(res == 3)
    {
      System.out.println("Your Balance Money Is : "+ (currentBalance-2000) +"Have A nice Flight Trip."); 
    }
    else if(res == 4)
    {
      System.out.println("Your Balance Money Is : "+ (currentBalance-2500) +"Have A nice Flight Trip."); 
    }
    else {
      System.out.println("invalid Selection ");
    }
    return 0;
  }
  static void travel(int currentBalance)
  {
        if(currentBalance>999 && currentBalance <1500)
        {
                        System.out.println("Places You Can Visit are :");
                        System.out.println("1.Istanbul");
                        bal=1000;
        }
        else if(currentBalance>1499 && currentBalance <1500)
        {
                        bal = 1500;
                        System.out.println("Places You Can Visit are :");
                        System.out.println("1.Istanbul");
                        System.out.println("2.Berlin");
                        System.out.println("which Place yoy Choose ?");

        }
        else if(currentBalance>1999 && currentBalance <2500)
        {
                        bal = 2000;
                        System.out.println("Places You Can Visit are :");
                        System.out.println("1.Istanbul");
                        System.out.println("2.Berlin");
                        System.out.println("3.Paris");
                        System.out.println("which Place yoy Choose ?");

        }
        else if(currentBalance>2499)
        {               bal = 2500;
                        System.out.println("Places You Can Visit are :");
                        System.out.println("1.Istanbul");
                        System.out.println("2.Berlin");
                        System.out.println("3.Paris");
                        System.out.println("4.Bengaluru");
                        System.out.println("which Place yoy Choose ?");
        }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the Balance :");
    int currentBalance = sc.nextInt();
    travel(currentBalance);
    int res;
     switch(bal){
      case 1000: 
                  res = sc.nextInt();
                  Balance(res,currentBalance);
                  System.out.println("balance");
                  break;
      case 1500:
                   res = sc.nextInt();
                   Balance(res,currentBalance);
                  break;
      case 2000:
                  res = sc.nextInt();
                  Balance(res,currentBalance);          
                  break;
      case 2500:
                  res = sc.nextInt();
                  Balance(res,currentBalance);
                  break;
      default : 
                System.out.println("You cant vist any Place: ");
     }
  }
}
