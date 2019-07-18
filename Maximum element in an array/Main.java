#include<stdio.h>
int main()
{
  	int n;
  scanf("%d",&n);
  int a[n];
  int i;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
 int large=a[0];
  for(i=0;i<n;i++)
  {
    if(a[i]>large)
    {
      large=a[i];
    }
  }
  printf("%d",large);
  return 0;
}