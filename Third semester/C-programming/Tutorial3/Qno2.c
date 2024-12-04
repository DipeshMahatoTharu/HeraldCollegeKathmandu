// 2. WAP to sort array elements in ascending order

#include <stdio.h>
int main(){
    int n = 4;
    int num[] ={4,59,32,78};
    int temp;

    for(int i = 0; i<n; i++){
        for(int j = i+1; j<n; j++){
            if (num[i] > num[j]){
                temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
    }
    for (int i = 0; i<n; i++){
        printf("%d ",num[i]);
    }
    return 0;
}
