#include<stdio.h>
int lcm(int,int);
int main()
{
  int a,b;
  scanf("%d%d",&a,&b);
  int res=lcm(a,b);
  int finallcm=(a*b)/res;
  printf("%d",finallcm);
  return 0;
}

int lcm(int x,int y)
{
  int hcf=x%y;
  if(hcf==0)
    return y;
  else
    return lcm(y,hcf);
}