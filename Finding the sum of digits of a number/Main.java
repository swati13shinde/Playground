#include <stdio.h>
int main() {
	//Type your code
  int n,t,sum=0,r;
  t=n;
  scanf("%d", &n);
  while(n!=0)
  {
    r=n%10;
    sum=sum+r;
    n=n/10;
  }
  printf("%d", sum);
	return 0;
}