#include <stdio.h>

int main() {
	// your code goes here
    int T;
    scanf("%d",&T);
    
    while(T--)
    {
        int N;
        scanf("%d",&N);
        
         long long arr[N];

        for (int i = 0; i < N; i++) {
            scanf("%lld", &arr[i]);
        }

        long long totalWait = 0;
        long long entryTime = arr[0];

        for (int i = 1; i < N; i++) {
            if (arr[i] < entryTime) {
                totalWait += (entryTime - arr[i]);
            } else {
                entryTime = arr[i];
            }
        }

        printf("%lld\n", totalWait);
    }

    return 0;
}