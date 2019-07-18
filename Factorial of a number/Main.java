#include <stdio.h>
int fact(int);
int main() {
  int n;
  scanf("%d",&n);
  int x=fact(n);
  printf("%d",x);
	
  
	return 0;
}
int fact(int z)
{
  if(z==0)
    return 0;
  else if(z==1)
    return 1;
  else
    return z*fact(z-1);
}