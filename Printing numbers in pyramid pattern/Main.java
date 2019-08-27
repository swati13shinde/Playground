#include <stdio.h>
int main() {
	// Type your code here
  int i, j, k, n;
  scanf("%d", &n);
  int val=1;
  for(i=1; i<=n; i++)
  {
    for(k=1; k<=(n-i); k++)
    {
      printf(" ");
    }
    for(j=1; j<=i; j++)
    {
      printf("%d ", val);
      val++;
    }
    printf("\n");
  }
	return 0;
}