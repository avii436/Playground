#include <stdio.h>
int main() {
	int n,rem,sum=0;
  scanf("%d",&n);
  int temp=n;
  while(temp!=0)
  {
    rem=temp%10;
    sum+=rem;
    temp/=10;
  }
  printf("%d",sum);
	return 0;
}