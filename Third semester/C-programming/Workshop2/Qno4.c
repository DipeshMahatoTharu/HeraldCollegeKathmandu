#include <stdio.h>
#include <math.h>

// Function to calculate missing variable based on the formula v = u + at
double velocityCalc(double v, double u, double a, double t) {
    if (!isnan(v) && !isnan(u) && !isnan(a) && !isnan(t)) {

        return NAN;
    }
    if (isnan(v)) {
        return u + (a * t);
    } else if (isnan(u)) {
        return v - (a * t);
    } else if (isnan(a)) {
        return (v - u) / t;
    } else if (isnan(t)) {
        return (v - u) / a;
    } else {
        return NAN;
    }
}

int main() {
    double v = NAN, u = NAN, a = NAN, t = NAN;
    int nanCount = 0;

    printf("Enter final velocity (v) or 'NAN' if unknown: ");
    if (scanf("%lf", &v) != 1) {
        nanCount++;
        v = NAN;
        scanf("%*s");
    }

    printf("Enter initial velocity (u) or 'NAN' if unknown: ");
    if (scanf("%lf", &u) != 1) {
        nanCount++;
        u = NAN;
        scanf("%*s");
    }

    printf("Enter acceleration (a) or 'NAN' if unknown: ");
    if (scanf("%lf", &a) != 1) {
        nanCount++;
        a = NAN;
        scanf("%*s");
    }

    printf("Enter time (t) or 'NAN' if unknown: ");
    if (scanf("%lf", &t) != 1) {
        nanCount++;
        t = NAN;
        scanf("%*s");
    }


    if (nanCount != 1) {
        printf("Error: Exactly one variable must be unknown.\n");
        return 1;
    }


    double result = velocityCalc(v, u, a, t);

    if (!isnan(result)) {
        printf("The calculated value is: %.2f\n", result);
    } else {
        printf("Error: cant  calculate the value.\n");
    }

    return 0;
}
