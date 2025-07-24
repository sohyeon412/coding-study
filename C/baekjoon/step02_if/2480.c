#include<stdio.h>

int main(void){
    int A, B, C;
    scanf("%d %d %d", &A, &B, &C);
    int reward = 0;

    if(A==B&&B==C){
        reward = 10000 + A*1000;
    }
    else if (A==B ||A==C ){
        reward = 1000 + A*100;
    }
    else if (B==C ){
        reward = 1000 + B*100;
    }
    else{
        int max=A;
        if(B>max) max=B;
        if(C>max) max=C;
        reward = max*100;
    }
    printf("%d\n",reward);
    return 0;
}