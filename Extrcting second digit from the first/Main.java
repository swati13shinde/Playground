#include <stdio.h>
int main() {
	//Type your code
  int n;
  int n1;
  scanf("%d", &n);
  while(n>=10)
  {
    //n=n%10;
    n1=n%10;
    n=n/10;
    
  }
  printf("%d", n1);
    
	return 0;
}