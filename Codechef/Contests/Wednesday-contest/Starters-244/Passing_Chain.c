#include <stdio.h>

int main() {
	// your code goes here
  int T;
  scanf("%d",&T);
  
  while(T--)
  {
    int N , K;
    scanf("%d %d",&N,&K);
    int X = 1;
    // printf("first");
    while (X + K <= N)
    {
            X += K;
    }
    
    printf("%d\n",X);
  }
  
  return 0;
}

