#include<stdio.h>
int main()
{
  int n,dec=0,temp,base=1,rem,i=0;
  scanf("%d",&n);
  temp=n;
  while(temp>0)
  {
    rem=temp%10;
    dec+=rem*pow(2,i);
    temp/=10;
    i++;
  }
  printf("%d",dec);
  return 0;
}