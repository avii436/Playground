#include<stdio.h>

int main()
{
  int a[4],i;
  for(i=0;i<4;i++)
  {
  scanf("%d",&a[i]);
  }
  int small=a[0];
  for(i=0;i<4;i++)
  {
  if(a[i]<small)
  {
    small=a[i];
  }
  }
 printf("%d",small);
}