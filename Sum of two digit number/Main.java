#include<stdio.h>
int main() { int n,s=0,rem; 
scanf("%d",&n); while(n){ rem=n%10; s+=rem; n/=10;} printf("%d",s); return 0; }