#include<stdio.h>

int main(void){
    int X, N;
    scanf("%d", &X);
    scanf("%d", &N);
    int total = 0;

    for(int i=0; i<N; i++){
        int a, b;
        scanf("%d %d", &a, &b);
        total+=a*b;
    }
    if (X==total) printf("Yes\n");
    else printf("No\n");

    return 0;
}