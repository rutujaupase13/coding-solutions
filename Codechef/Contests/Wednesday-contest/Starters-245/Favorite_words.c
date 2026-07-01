#include <stdio.h>

int main() {
	// your code goes here
	char str[4];
	scanf("%s",&str);
	
	if(str[0] == 'c' || str[3] == 'f')
	{
	    printf("Yes");
	}
	else
	{
	    printf("No");
	}
	
	return 0;

}
