#include<stdio.h>
int fib(int);
int main()
{
  int n,a=0,b=1,c;
  scanf("%d",&n);
  int i=0;
  for(i=0;i<n;i++)
  {
    if(i<=1)
    {
      c=i;
    }
    else
    {
    c=a+b;
    a=b;
    b=c;
    }
    printf("%d ",c);
  }
  

  
  return 0;
}
