import java.util.*;
public class Sol{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++)a[i]=sc.nextLong();
        long sum=0;int d=1;
        for(int i=0;i<m;i++){
            long x=sc.nextLong();
            while(sum+a[d-1]<x){sum+=a[d-1];d++;
            }
            System.out.println(d+" "+(x-sum));
        }
    }
}