#include <stdio.h>

int main() {
	// your code goes here
    int T;
    scanf("%d",&T);
    
    while(T--)
    {
        int N;
        scanf("%d",&N);
        
        int arr[N];
        
        for(int i= 0;i < N;i++)
        {
            scanf("%d",&arr[i]);
        }
         int ans = 0;

        for (int i = 0; i < N - 1; i++) {
            int height;

            if (arr[i] < arr[i + 1])
                height = arr[i];
            else
                height = arr[i + 1];

            if (height > ans)
                ans = height;
        }

        printf("%d\n", ans);
    }

    return 0;
}

