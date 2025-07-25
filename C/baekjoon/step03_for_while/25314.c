#include<stdio.h>

int main(void){
    int N;
    scanf("%d", &N);
    int cnt= N/4;

    for(int i=0; i<cnt; i++){
        printf("long ");
    }
    printf("int\n");
    return 0;
}