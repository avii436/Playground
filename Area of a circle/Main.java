#include<stdio.h>
#define pi 3.14
int main()
{
 int dia;
  float area,radius;
  scanf("%d",&dia);
  radius=(float)dia/2;
  area=pi*radius*radius;
  printf("%.2f",area);
  return 0;
}