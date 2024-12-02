#include <stdio.h>
#include <math.h>
// Function to calculate velocity based on the formula v = u + at
double velocityCalc(double u, double a, float t) {
    if (isnan(u)) {
        return a * t;
    } else if (isnan(a)) {
        return (u / t);
    } else if (isnan(t)) {
        return (u + a);
    } else {
        return u + a * t;
    }
}
int main() {
    double u = 21;
    double a = 32;
    float t = 32.3;
    printf("Final velocity: %f\n", velocityCalc(u, a, t));
    return 0;
}
