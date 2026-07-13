#include <stdio.h>

int main() {
	// your code goes here
    int S,B,R;
    scanf("%d %d %d",&S,&B,&R);
    
    int salary = S + R * B;
    
    printf("%d",salary);
    
    return 0;
}
