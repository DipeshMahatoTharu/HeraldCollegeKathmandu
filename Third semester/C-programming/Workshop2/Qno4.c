#include <stdio.h>
#include <math.h>

// Function to calculate velocity based on the formula v = u + at
double velocityCalc(double u, double a, float t) {
    if (isnan(u)) {
        return a * t;  // If u is NAN, solve for v: v = a * t
    } else if (isnan(a)) {
        return (u / t);  // If a is NAN, solve for v: v = u + a * t, a = (v - u) / t
    } else if (isnan(t)) {
        return (u + a);  // If t is NAN, solve for v: v = u + a * t
    } else {
        return u + a * t;  // Normal case: v = u + a * t
    }
}

int main() {
    double u = 21; // Initial velocity
    double a = 32; // Acceleration
    float t = 32.3; // Time

    printf("Final velocity: %f\n", velocityCalc(u, a, t));  // Calculate velocity

    return 0;
}
