#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}

int main() {
    int N;
    scanf("%d", &N);

    int V[N], P[N];

    for (int i = 0; i < N; i++) {
        scanf("%d", &V[i]);
    }

    for (int i = 0; i < N; i++) {
        scanf("%d", &P[i]);
    }

    qsort(V, N, sizeof(int), compare);
    qsort(P, N, sizeof(int), compare);

    for (int i = 0; i < N; i++) {
        if (V[i] <= P[i]) {
            printf("No\n");
            return 0;
        }
    }

    printf("Yes\n");

    return 0;
}