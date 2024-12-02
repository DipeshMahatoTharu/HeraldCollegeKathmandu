//make function name equation  which solve followin equation with 6 parameter
#include <stdio.h>

void equations(double a, double b, double c, double d, double e, double f) {

    double determinant = a * e - b * d;


    if (determinant == 0) {
        printf("The system has no unique solution.\n");
    } else {

        double x = (c * e - b * f) / determinant;
        double y = (a * f - c * d) / determinant;

        printf("The solution is: x = %.2f, y = %.2f\n", x, y);
    }
}

int main() {
    double a, b, c, d, e, f;

    printf("Enter coefficients a, b, c (for equation ax + by = c): ");
    scanf("%f %f %f", &a, &b, &c);

    printf("Enter coefficients d, e, f (for equation dx + ey = f): ");
    scanf("%f %f %f", &d, &e, &f);


    equations(a, b, c, d, e, f);

    return 0;
}
