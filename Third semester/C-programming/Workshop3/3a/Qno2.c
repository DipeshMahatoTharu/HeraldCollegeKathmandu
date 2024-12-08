/* Write a program to count and find the sum of all the numbers in the array
 which are exactly divisible by 7 and not divisible by 2 and 3.
 */
#include <stdio.h>
int main() {
    int n = 4;
    int arry[] = {7,49,45,78};
    int count = 0, sum = 0, i;

    for (i = 0; i < n; i++) {
        if (arry[i] % 7 == 0 && arry[i] % 2 != 0 && arry[i] % 3 != 0) {
            sum += arry[i];
            count++;
        }
    }

    printf("The sum of numbers divisible by 7 and not divisible by 2 and 3 is: %d\n", sum);
    printf("The count of such numbers is: %d\n", count);

    return 0;
}
