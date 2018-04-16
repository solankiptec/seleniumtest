import java.util.Scanner;

/**
 * Created by Welcome on 23/07/2017.
 */
public class Evenodd1 {
    public static void main (String[] args){
        Scanner sc =new  Scanner (System.in);
        System.out.println(" enter any two number :" );
        int a = sc. nextInt();
        int b = sc.nextInt();
        m1(a);
        m1(b);
    }
    public static void m1 (int c){
        if(c%2==0){
            System.out.println(c+" = even");
        }else{
            System.out.println(c+" = odd ");
        }
    }
}


