#include <stdio.h>
#include<math.h>
#define pi 3.14
int main()
{
	float r,a;
    scanf("%f%f",&r,&a);
    float res=2*pi*r*(a/360);
    printf("%.2f",res);
    return 0;
}