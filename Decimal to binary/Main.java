#include<stdio.h>
int main()
{
  int n,base=1,bin=0,rem;
  scanf("%d",&n);
  int temp=n;
  while(temp>0)
  {
    rem=temp%2;
    bin+=rem*base;
    temp/=2;
    base*=10;
  }
  printf("%d",bin);
  return 0;
}