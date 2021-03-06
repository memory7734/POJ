import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigInteger suma,sumb;
        Scanner scanner =new Scanner(System.in);
        int count=scanner.nextInt();
        int a[]=new int[128];
        int b[]=new int[128];
        while (count>0)
        {
            suma=BigInteger.ZERO;
            sumb=BigInteger.ZERO;
            int n=scanner.nextInt();
            for(int i=n-1;i>=0;i--)
                a[i]=scanner.nextInt();
            for(int i=n-1;i>=0;i--)
                b[i]=scanner.nextInt();
            for(int i=0;i<n;i++)
            {
                suma=(suma.shiftLeft(1)).add((suma.mod(BigInteger.valueOf(2))).xor(BigInteger.valueOf(a[i])));
                sumb=(sumb.shiftLeft(1)).add((sumb.mod(BigInteger.valueOf(2))).xor(BigInteger.valueOf(b[i])));
           }
            System.out.println( suma.abs().subtract(sumb.abs()).abs());
            count--;
        }

    }
}