#include<stdio.h>
int main()
{
int n,i,sum=0,count=0,isprime,j;
  scanf("%d",&n);
  for(i=2;i<=n;i++)
  {
    isprime=1;
    for(j=2;j<=i/2;j++)
    {
    if(i%j==0)
    {
      isprime=0;
      break;
    }
    }
 if(isprime==1)
   sum+=i;
  }
printf("%d",sum);
  return 0;
}