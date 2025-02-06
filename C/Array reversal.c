#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num, *arr, i;
    printf("Enter the Range:");
    scanf("%d", &num);
    arr = (int*) malloc(num * sizeof(int));
    printf("Enter the numbers:");
    for(i = 0; i < num; i++) {
        scanf("%d", arr + i);
    }
    
    for (int i=num-1; i>=0; i--) {
     printf("%d ",arr[i]);
    }


    for(i = 0; i < num; i++)
        printf("%d ", *(arr + i));
    return 0;
}