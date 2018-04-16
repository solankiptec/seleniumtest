import java.util.Scanner;

/**
 * Created by Welcome on 23/07/2017.
 */
public class PiggyBank
{
    Scanner sc = new Scanner(System.in);
   static int balance=100;

   public static void main(String[]args)
    {
            statement();
            deposit(50);
            withdraw(100);
    }
    public static void statement()
    {
       System.out.println("Your Balance is "+balance);
    }

    public static void deposit(int deposit)
    {
        balance=balance+deposit;
        System.out.println("You have deposited "+deposit);
        statement();
    }

    public static void withdraw(int withdraw)
    {
        balance=balance-withdraw;
        System.out.println("You have withdrawn "+withdraw);
        statement();
    }
    }

