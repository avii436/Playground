#include<stdio.h>
int main()
{
  float p,b,h;
  scanf("%f%f",&p,&b);
  float x=(p*p)+(b*b);
  h=sqrt(x);
  printf("%.2f",h);
  return 0;
}