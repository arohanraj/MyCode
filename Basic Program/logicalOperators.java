import java.util.*;

public class logicalOperators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean x = (a<= 10 && b >= 10);
        boolean y = (a%2==0 || b%2==0);
        boolean z = a!= b;

        System.out.print (x + " ");
        System.out.print (y + " ");
        System.out.print (z);
    }   
}
