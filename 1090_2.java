import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a[]=new int[1000];
        int n=scanner.nextInt();
        for(int i=n-1;i>=0;i--)
            a[i]=scanner.nextInt();
        BigInteger sum=BigInteger.valueOf(a[0]);
        for(int i=1;i<n;i++)
        {
            sum=(sum.shiftLeft(1)).add((sum.mod(BigInteger.valueOf(2))).xor(BigInteger.valueOf(a[i])));
        }
        sum.abs();
        System.out.print(sum);
    }
}