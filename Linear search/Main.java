#include<stdio.h>
int main()
{
int n,s,pos,flag=0;
  scanf("%d",&n);
  int a[n],i,j;
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&s);
  for(i=0;i<n;i++)
  {
       if(a[i]==s)
       {
         pos=i;
         printf("%d",pos+1);
         break;
        }
  }
  
  if(i==n)
  {
    printf("%d isn't present in the array.",s);
  }


  return 0;
}