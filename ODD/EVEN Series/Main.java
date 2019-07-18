#include<stdio.h>
int main()
{
	int n,to,te,a,d,tn;
  scanf("%d",&n);
if(n%2==1)
{
  a=0;
  d=2;
  to=(n+1)/2;
  tn=a+((to-1)*d);
  printf("%d",tn);
}
  else
  {
  a=0;
  d=1;
  te=n/2;
  tn=a+((te-1)*d);
    printf("%d",tn);
    
  }
	
}