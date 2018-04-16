import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by Welcome on 23/07/2017.
 */
public class BankAccount {
    static int balance ;
    static int Withdrow;
    static int Deposit ;
    public static void main (String[]agrs) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int C;
        Statment();
        Deposit();
        Withdrow();

    }
    public static void Statment(){
        System.out.println("your balance is=" +balance);
    }
    public static void Deposit(){
        System.out.println("you diposite"+Deposit);
        balance=balance+Deposit;
        Statment();
    }
    public static void Withdrow(){
       System.out.println("you withdrown ="+Withdrow);
        balance=balance-Withdrow;
        Statment();
    }
}
