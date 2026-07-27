int main() {
    int N;
    scanf("%d", &N);

    int A[N];

    for (int i = 0; i < N; i++) {
        scanf("%d", &A[i]);
    }

    int groups = 1;

    for (int i = 1; i < N; i++) {
        if (A[i] != A[i - 1]) {
            groups++;
        }
    }

    printf("%d\n", groups);

    return 0;
}
