#include <stdio.h>

int main() {
    int X, Y;

    scanf("%d %d", &X, &Y);

    if (Y >= X) {
        printf("UNLOCKED");
    } else {
        printf("%d", X - Y);
    }

    return 0;
}