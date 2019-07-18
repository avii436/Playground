#include<stdio.h>

int main()
{
  int n;
  scanf("%d",&n);
  if(n%2==1)
  {
    int nth,res;
    nth=(n)/2;
    res=2*nth;
    printf("%d",res);
  }
  else
  {
    int nth,res;
    nth=n/2;
    printf("%d",nth-1);
  }
}