#include <stdio.h>

int main()
{
	int a,b;
    float m,n;
    printf("Enter the two decimal number:");
    scanf("%d %d",&a,&b);
    printf("Enter the two float number:");
    scanf("%f %f",&m,&n);
    printf("\n%d %d\n",a+b,a-b);
    printf("%.1f %.1f\n",m+n,m-n);
    
    return 0;
}