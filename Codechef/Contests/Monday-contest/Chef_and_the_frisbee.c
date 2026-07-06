#include <stdio.h>

int main() {
	// your code goes here
    int T;
    scanf("%d",&T);
    char *coordinates;
    while(T--)
    {
        int x1,y1,x2,y2;
        scanf("%d %d %d %d",&x1,&y1,&x2,&y2);
        
        if(x1 == x2 )
        {
            if(y1 > y2)
            {
                coordinates = "down";
            }
            else 
            {
                coordinates = "up";
            }
        }
        else if(y1 == y2)
        {
            if(x1 > x2)
            {
                coordinates = "left";
            }
            else
            {
                coordinates = "right";
            }
        }
        else
        {
            coordinates = "sad";
        }
        
        printf("%s\n",coordinates);
    }
    
    return 0;
}

