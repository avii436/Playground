#include <stdio.h>
int fact(int);
int main() {
	int n,a,b,c,x,d;
  scanf("%d",&n);
   a=n/100;
  d=n/10;
  b=d%10;
   c=n%10;
 
  x=fact(a)+fact(c)+fact(b);
  if(x==n)
    printf("Yes");
  else
    printf("No");
	return 0;
}

int fact(int z)
{
   if(z==1)
    return 1;
   else
    return z*fact(z-1);
}