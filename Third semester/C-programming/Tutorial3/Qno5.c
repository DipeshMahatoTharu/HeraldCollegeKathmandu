//WAP to store the name of week days and then print all.
#include <stdio.h>

int main() {
    // Array to store the names of the weekdays
    const char *weekdays[] = {
        "Sunday",
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday"
    };

    int numOfDays = 7;

    // Print all weekdays
    printf("The days of the week are:\n");
    for (int i = 0; i < numOfDays; i++) {
        printf("%s\n", weekdays[i]);
    }

    return 0;
}

