#include<stdio.h>
int main()
{
  	int n,num1,num2,num1_index=-1,num2_index=-1;
  scanf("%d",&n);
  int a[n];
  int i;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&num1,&num2);
  for(i=0;i<n;i++)
  {
    if(num1==a[i] && num1_index==-1)
    {
      num1_index=i;
    }
    if(num2==a[i] && num2_index==-1)
    {
      num2_index=i;
    }
  }
printf("Element 1 index = %d\nElement 2 index = %d",num1_index,num2_index);
  return 0;
}