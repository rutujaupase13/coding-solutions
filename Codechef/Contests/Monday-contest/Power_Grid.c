#include <stdio.h>

int main() {
	// your code goes here
    
    int R,C,W;
    scanf("%d %d %d",&R,&C,&W);
    
    int power = (R * C) * W;
    printf("%d",power);
    
    return 0;
}
