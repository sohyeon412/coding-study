#include<stdio.h>

int main(void){
    int H, M, C;
    scanf("%d %d", &H, &M);
    scanf("%d", &C);

    M+=C;
    H+=M/60;
    M=M%60;

    if(H>=24){
        H = H % 24;
    }

    printf("%d %d", H, M);
    return 0;
}