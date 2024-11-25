#include <stdio.h>
#include <ctype.h>

int main() {
    char ch;

    printf("Enter characters Press Enter to stop: \n");

    while (ch != 13 ) {
        ch = getchar();

      //  if (ch == 13) {
        //    break;
        //}

        if (isupper(ch)) {
            ch = tolower(ch);
        }

    break;
        printf("%c", ch);

    }

    return 0;
}
