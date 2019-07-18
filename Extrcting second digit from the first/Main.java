#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int temp=n;
  while(temp>100)
  {
  temp/=10;
  }
  int x=temp;

  printf("%d",x%10);
	return 0;
}