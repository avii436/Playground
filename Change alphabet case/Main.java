#include <stdio.h>
#include<string.h>
int main() {
	char a[10],ch;
   int  i=0;
gets(a);
  
  while(a[i]!='\0')
  {
   
    if(a[i]>='a' && a[i]<='z')
    {
      a[i]=a[i]-32;
    }
    else
    {
      a[i]=a[i]+32;
    }
   i++;
  }
  
  printf("%s",a);
  
  
  
	return 0;
}
