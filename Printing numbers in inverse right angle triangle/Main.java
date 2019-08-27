#include <stdio.h>
int main() {
    // Type your code here4
  int n, i, j;
  scanf("%d" ,&n);
  for(i=n; i>=1; i--)
  {
    int num = i;
    for(j=1; j<=i; j++)
    {
      printf("%d", num);
      num= num-1;
    }
  printf("\n");
}
	return 0;
}