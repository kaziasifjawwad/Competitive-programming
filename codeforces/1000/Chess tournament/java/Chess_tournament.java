package one_thousand;

import java.util.Scanner;

public class Chess_tournament {

    public static boolean flag=true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int size =sc.nextInt();
            char matrix[][] = new char[size][size];
            sc.nextLine();
            String expectation = sc.nextLine();

            matrixBuilder(matrix, expectation);
            if(flag){
                System.out.println("YES");
                print(matrix);
            }
            else{
                System.out.println("NO");
            }
            flag=true;
        }


    }

    public static void matrixBuilder(char[][] matrix, String expectation){
        for(int i=0;i<expectation.length();i++){
            if(expectation.charAt(i)=='1'){
                winAllTournament(matrix,i);
            }
            else{
                winAtLeastOneTournament(matrix,i,expectation);
            }

//            print(matrix);
//            System.out.println("*************************");
        }
    }

    public static void winAtLeastOneTournament(char[][] matrix, int i, String expectation){
//        System.out.println("here is a x"+i);
        boolean temp=false;
        for(int j=0;j<matrix.length;j++){
            if(i!=j){
            if(expectation.charAt(j)!='1'){
                if(matrix[i][j]=='\u0000'){
                    matrix[i][j]='+';
                    matrix[j][i]='-';
                    temp=true;
                    break;
                }
            }
            }

        }
        matrix[i][i]='X';
        flag=flag&&temp;

    }

    public static void winAllTournament(char[][] matrix, int i){
        for(int j=0;j<matrix.length;j++){
            if(i==j){
                matrix[i][j]='X';
            }
//            else if(matrix[j][i]=='+'){
//                matrix[i][j]='=';
//                matrix[j][i]='=';
//            }
            else{
                matrix[i][j]='=';
                matrix[j][i]='=';
            }
        }

    }


    public static void print(char [][] matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]=='\u0000'){
                    if(matrix[j][i]=='-'){
                        matrix[i][j]='+';
                    }
                    else{
                        matrix[i][j]='-';
                    }
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }


}
