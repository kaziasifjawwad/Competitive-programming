package one_thousand;

import java.util.Scanner;

public class Different_Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            int result = findMatch(input);
            System.out.println(result);
        }


    }

    public static int findMatch(int input){
        int first=nextAvailablePrime(input+1);
        int temp = first+input;
        int second = nextAvailablePrime(temp);
        return first*second;
    }


    public static int nextAvailablePrime(int input){
        while(true){
            if (ifPrime(input)){
                return input;
            }
            input++;
        }
    }


    public static boolean ifPrime(int input){
        int limit = (int)Math.sqrt(input);
        for(int i=2;i<=limit;i++){
            if(input%i==0){
                return false;
            }
        }
        return true;

    }
}
