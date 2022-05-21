import java.util.Scanner;
public class Robots{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        for(int i=0;i<n;i++){
            int col = sc.nextInt();
            int row = sc.nextInt();
            sc.nextLine();
            System.out.println(checkValidity(col,row));
        }


    }

    public static String checkValidity(int col,int row){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int ref_row = 0;
        int ref_col = 0;
        for(int i=0;i<row;i++){
            String tempInput = sc.nextLine();
            for(int index=0;i<tempInput.length();i++){
                if(!flag && tempInput.charAt(index)=='R'){
                    System.out.println("***");
                    ref_row=i;
                    ref_col=index;
                    flag=true;
                }
                else if(tempInput.charAt(index)=='R'){
                    if((i-ref_row<0)||index-ref_col<0){
                        return "NO";
                    }
                }
            }
        }
        return "YES";
    }
}