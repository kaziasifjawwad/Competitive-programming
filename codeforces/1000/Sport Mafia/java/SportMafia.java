package one_thousand;

import java.util.Scanner;

public class SportMafia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a=sc.nextInt();
        long b=sc.nextInt();
        long result = middlePoint(a,b);
        System.out.println(Math.abs(result));


    }

    public static long middlePoint(long number,long leftCandy){

        if(number==1){
            return 0;
        }

        long left=1,right=number;
        long middle = 0;


        while(true){
            middle = (left+right)/2;
            long result = (middle*(middle-1))/2;
            long rem = result-(number-middle+1);


            if(rem==leftCandy){
                return result-leftCandy;
            }

            if(rem>leftCandy){
                right=middle-1;
            }
            else{
                left=middle+1;

            }
        }
    }
}
