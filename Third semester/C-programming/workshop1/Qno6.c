#include <stdio.h>

int main() {
    for (char ch = 'A'; ch <= 'E'; ch++) {
        for (char i = 'A'; i <= ch; i++) {
            printf("%c ", ch);
        }
        printf("\n");
    }

    return 0;
}
