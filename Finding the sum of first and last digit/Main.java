#include <stdio.h>
int main() {
	//Type your code
  int n,n1,n2,n3;
  scanf("%d", &n);
  n1=n%10;
  while(n>=10)
  {
    //n1=n%10;
    n2=n/10;
    n3=n1+n2;
    n=n/10;
  }
  printf("%d",n3);
	return 0;
}