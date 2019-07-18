#include <stdio.h>
int gcd(int,int);
int main()
{
  int a,b;
  scanf("%d%d",&a,&b);
  int res=gcd(a,b);
  printf("%d",res);
  return 0;
}

int gcd(int x,int y)
{
  int div=x%y;
  if(div==0)
    return y;
  else
    return gcd(y,div);
}