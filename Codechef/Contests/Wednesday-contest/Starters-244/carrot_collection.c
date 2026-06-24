#include <stdio.h>

int main() {
    int T;
    scanf("%d", &T);

    while (T--) {
        int N, L, R;
        scanf("%d %d %d", &N, &L, &R);

        int A[105];

        for (int i = 1; i <= N; i++) {
            scanf("%d", &A[i]);
        }

        int leftSum = 0;
        int rightSum = 0;

        // Collect carrots from safe clearings on the left
        for (int i = 1; i < L; i++) {
            leftSum += A[i];
        }

        // Collect carrots from safe clearings on the right
        for (int i = R + 1; i <= N; i++) {
            rightSum += A[i];
        }

        if (leftSum > rightSum)
            printf("%d\n", leftSum);
        else
            printf("%d\n", rightSum);
    }

    return 0;
}