import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigInteger sum=BigInteger.ZERO;
        Scanner scanner =new Scanner(System.in);
        int a[]=new int[1000];
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=scanner.nextInt();
            if(a[i]==1)
                sum=(BigInteger.valueOf(2).pow(i+1).subtract(BigInteger.ONE)).subtract(sum);
        }
        if(sum.compareTo(BigInteger.ZERO)<0)
            sum=BigInteger.ZERO.subtract(sum);
        System.out.print(sum);
    }
}