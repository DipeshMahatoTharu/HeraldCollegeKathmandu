#include <stdio.h>

int main() {

    FILE *sourceFile = fopen("C:\\Third semester\\C-programming\\workshop6\\employee.txt", "r");
    FILE *destFile = fopen("C:\\Third semester\\C-programming\\workshop6\\newemployee.txt", "w");

    if (sourceFile == NULL || destFile == NULL) {
        printf("Error opening file.\n");
        return 1;
    }

    char ch;

    while ((ch = fgetc(sourceFile)) != EOF) {
        fputc(ch, destFile);
    }

    fclose(sourceFile);
    fclose(destFile);
    printf("Content copied to employee.txt.\n");
    return 0;
}
