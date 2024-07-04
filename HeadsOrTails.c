#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    char name[20];
    int heads = 0, tails = 0;

    printf("Who are you?\n> ");
    scanf("%s", name);
    printf("Hello, %s!\n", name);

    srand(time(NULL));
    printf("Tossing a coin...\n");
    for (int i = 1; i <= 3; i++) {
        int toss = rand() % 2;
        if (toss == 0) {
            printf("Round %d: Heads\n", i);
            heads++;
        } else {
            printf("Round %d: Tails\n", i);
            tails++;
        }
    }

    printf("Heads: %d, Tails: %d\n", heads, tails);
    if (heads > tails) {
        printf("You won!\n");
    } else {
        printf("You lost\n");
    }

    return 0;
}
