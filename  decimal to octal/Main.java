#include<stdio.h>
int main()
{
  int n,base=1,oct=0,temp,rem;
  scanf("%d",&n);
  temp=n;
  while(temp>0)
  {
    rem=temp%8;
    oct+=(rem*base);
    temp/=8;
    base*=10;
    
  }
  printf("%d",oct);
  return 0;
}