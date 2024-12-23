//// Task 1: Create a structure to hold any complex number x+iy.
#include <stdio.h>

typedef struct {
    float real;
    float imag;
} Complex;

Complex readComplex() {
    Complex c;
    printf("Enter real and imaginary parts: ");
    scanf("%f %f", &c.real, &c.imag);
    return c;
}

Complex addComplex(Complex a, Complex b) {
    Complex result;
    result.real = a.real + b.real;
    result.imag = a.imag + b.imag;
    return result;
}

void displayComplex(Complex c) {
    printf("%.2f + %.2fi\n", c.real, c.imag);
}

int main() {
    Complex c1, c2, c3;
    printf("Enter first complex number:\n");
    c1 = readComplex();
    printf("Enter second complex number:\n");
    c2 = readComplex();
    c3 = addComplex(c1, c2);
    printf("Sum: ");
    displayComplex(c3);
    return 0;
}
