//package one_thousand;
import java.util.Scanner;

public class Add_and_Divide {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        for(int i=0;i<counter;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            check(a,b);
        }
    }


    public static void check(int a, int b){
        int outer_counter = 0;
        if(b==1){
            outer_counter++;
            b++;
        }
        long result =35;
        for(int i=0;i<=30;i++){
            int temp_b = b+i;
            int zero = a;
            int innter_counter = i;
            while(zero!=0){
                zero/=temp_b;
                innter_counter++;
            }
            result = min(result,innter_counter+outer_counter);
        }
        System.out.println(result);

    }

    public static long min(long first,int second){
        if(first<second){
            return first;
        }
        return second;
    }
}
