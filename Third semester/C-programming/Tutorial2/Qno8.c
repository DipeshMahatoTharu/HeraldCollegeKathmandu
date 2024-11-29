//to check if num is perfect or arm_Strong
#include <stdio.h>
#include <math.h>

// Function   an Armstrong number
int isArmstrong(int num) {
    int originalNum = num, remainder, result = 0;
    int n = 0;

    // user checking the num
    while (originalNum != 0) {
        originalNum /= 10;
        n++;
    }

    originalNum = num;
    while (originalNum != 0) {
        remainder = originalNum % 10;
        result += pow(remainder, n);
        originalNum /= 10;
    }

    return (result == num);
}

// to check perfect num
int isPerfect(int num) {
    int sum = 0;
    for (int i = 1; i <= num / 2; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }
    return (sum == num);
}

int main() {
    int num;

    printf("Enter a positive integer: ");
    scanf("%d", &num);

    //armstf
    if (isArmstrong(num))
        printf("%d is an Armstrong number.\n", num);
    else
        printf("%d is not an Armstrong number.\n", num);

    // pernum
    if (isPerfect(num))
        printf("%d is a Perfect number.\n", num);
    else
        printf("%d is not a Perfect number.\n", num);

    return 0;
}
