#include <stdio.h>
int main() {
	int n,rem,temp,sum=0;
  scanf("%d",&n);
  temp=n;
  while(temp!=0)
  {
    rem=temp%10;
    sum=sum+(rem*rem*rem);
    temp/=10;
    
  }
  if(sum==n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}