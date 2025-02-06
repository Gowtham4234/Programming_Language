#include <stdio.h>

int main() 
{

    int n;
    printf("Enter the Range:");
    scanf("%d", &n);
    int s = 2*n-1;
  	for (int i=0; i<s; i++) {
        for (int j=0; j<s; j++) {
            int min = i<j? i:j;
            if(min> s-i-1) min =s-i-1;
            if(min> s-j-1) min =s-j-1;
            printf("%d",n-min);
        }
        printf("\n");
    }
    return 0;
}