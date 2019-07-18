#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int last=n%10;
  int temp=n;
  while(temp>10)
  {
  temp/=10;
  }
  int first=temp;
int sum=first+last;
  printf("%d",sum);
	  return 0;
}