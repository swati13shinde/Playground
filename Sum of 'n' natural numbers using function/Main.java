#include<stdio.h>
int sumn(int num);
  int main(){
    int n;
    scanf("%d", &n);
    printf("%d", sumn(n));
    return 0;
  }
int sumn(int num)
{
  int sum=0;
  for(int i=1; i<=num; i++)
  {
    sum = sum+i;
  }
  return sum;
}