#include<iostream>
using namespace std;




int main(){
    int n,row,col;

    
    cin>>n;
    for(int m = 0;m<n;m++){
    int result =0;
    cin>>row;
    cin>>col;
    int array[row][col];

    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            cin>>array[i][j];
        }
    }

    for(int i=0;i<row;i++){

        int tempRes = 0;

        for(int j=0;j<col;j++){
            tempRes = array[i][j];
            int k=i-1;
            int l = j+1;
            while( k >= 0 && l<col){
                tempRes=tempRes+array[k][l];
                k--;
                l++;
            }

            k=i-1;
            l = j-1;
            while(k>=0&&l>=0){
                
                tempRes=tempRes+array[k][l];
                k--;
                l--;
            }

            k = i+1;
            l = j+1;
            while(k < row && l < col){
                tempRes=tempRes + array[k][l];
                k++;
                l++;
            }

            k = i+1;
            l = j-1;
            while(k < row && l >= 0){
                tempRes= tempRes + array[k][l];
                k++;
                l--;
            }
            if(tempRes>result){
            result = tempRes;
            }
        }


    }
    cout<<result<<endl;
    }
    
}