#include <stdio.h>
int pow(int,int);
int main()
{
  int b,p;
  scanf("%d%d",&b,&p);
  if(p<0)
  {
    printf("Wrong input");
  }
  else
  {
  int x=pow(b,p);
  printf("%d",x);
  }	   
    return 0;
}

int pow(int b,int p)
{
  if(p==0)
    return 1;
  else 
    return (b*pow(b,p-1));

}