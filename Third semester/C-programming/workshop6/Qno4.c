#include <stdio.h>
#include <string.h>

int main() {
    int num;
    char choice[5];
    FILE *oddFile = fopen("C:\\Third semester\\C-programming\\workshop6\\odd.txt", "w");
    FILE *evenFile = fopen("C:\\Third semester\\C-programming\\workshop6\\even.txt", "w");



    do {
        printf("Enter an integer: ");
        scanf("%d", &num);

        if (num % 2 == 0) {
            fprintf(evenFile, "%d\n", num);
        } else {
            fprintf(oddFile, "%d\n", num);
        }

        printf("Do you want to enter another number? (yes/no): ");
        scanf("%s", choice);
    } while (strcmp(choice, "no") != 0);

    fclose(oddFile);
    fclose(evenFile);
    printf("Odd and even numbers written to odd.txt and even.txt respectively.\n");
    return 0;
}
