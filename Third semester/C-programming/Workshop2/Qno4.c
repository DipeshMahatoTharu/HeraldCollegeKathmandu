#include <math.h>

double velocityCalc(double v, double u, double a, double t) {
    if (isnan(v)) {
        return u + a * t;
    } else if (isnan(u)) {
       return v - a * t;
    } else if (isnan(a)) {
       return (v - u) / t;
   } else if (isnan(t)) {
        return (v - u) / a;
    } else {
        return NAN;
    }
}
int main(){
   double v = velocityCalc(0, NAN, 9.8, 2);
   printf("Calculated velocity: %.2f\n", v);
   return 0;
}
