#include <stdio.h>

int main() {
	// your code goes here
  int D,T;
  scanf("%d %d",&D,&T);
  int time=0;
  
  if(T < D)
  {
    time = D - T; 
  }
  
  printf("%d",time);
  return 0;
}

