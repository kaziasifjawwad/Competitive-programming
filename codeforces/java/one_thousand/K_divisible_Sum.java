package one_thousand;

import java.util.Scanner;

public class K_divisible_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp[] = {5, 2, 7, 10};
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = calculate(a,b);
            System.out.println(result);

        }
    }

        public static int calculate(int a,int b) {
            if (b == 1) {
                return 1;
            }
            else if(a==1){
                return b;
            }
            else if(b<a){
                 b=(a%b)+a;
            }
            if(b%a==0){
                return b/a;
            }
            return (b/a)+1;
        }

    }

