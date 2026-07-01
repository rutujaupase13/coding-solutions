#include <stdio.h>

int main() {

    int T;
    scanf("%d", &T);

    while (T--) {

        int N, K;
        scanf("%d %d", &N, &K);

        int A[105];

        for (int i = 0; i < N; i++)
            scanf("%d", &A[i]);

        int ans = 0;

        // Try every starting value of X
        for (int X = 0; X <= K; X++) {

            int red = X;
            int blue = K - X;

            int ok = 1;

            for (int i = 0; i < N; i++) {

                if (A[i] > 0) {

                    if (blue < A[i]) {
                        ok = 0;
                        break;
                    }

                    red += A[i];
                    blue -= A[i];

                } else {

                    int val = -A[i];

                    if (red < val) {
                        ok = 0;
                        break;
                    }

                    red -= val;
                    blue += val;
                }
            }

            if (ok) {
                ans = 1;
                break;
            }
        }

        if (ans)
            printf("Yes\n");
        else
            printf("No\n");
    }

    return 0;
}