package one_thousand;

import java.util.Scanner;

public class Fair_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextInt();
        for(long i=0;i<n;i++) {
            long input=sc.nextLong();
            long res =   result(input);
            System.out.println(res);
        }
    }

    private static long result(long input) {
       while(true){
           if (authentication(input)){
               return  input;
           }
           input++;
       }
    }

    public static boolean authentication(long input){
        long temp = input;
        while(input!=0){
            long x = input%10;
            if(x!=0){
                if(temp%x!=0){
                    return false;
                }
            }
            input/=10;
        }
        return true;
    }


    public static long fingLcm(long number){
        if(number%10==0){
            number/=10;
        }

        if(number/10==0){
            return number;
        }

        long first = number%10;
        number=number/10;
        long second = number%10;
        number = number/10;
        long lcm = 0;

        if(number==0){
            long gcd = findGcd(first,second);
            lcm = (first*second)/gcd;
            return lcm;
        }

        while(number!=0){
            long gcd = findGcd(first,second);
            lcm = (first*second)/gcd;
            first = gcd;
            second = number%10;
            number=number/10;

        }
        return lcm;
    }

    public static long findGcd(long first, long second){
        if(second<first){
            long temp=second;
            second=first;
            first=temp;
        }
//        System.out.println(second+"   "+first);
        while(second%first!=0){
            long temp = first;
            first=second%first;
            second=temp;

        }
//        System.out.println(second+"----"+first);
        return first;
    }

}
