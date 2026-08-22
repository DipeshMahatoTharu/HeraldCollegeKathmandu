import numpy as np
import matplotlib.pyplot as plt

def plot_function(func, a, b):
    x = np.linspace(a, b, 1000)
    y = func(x)
    plt.plot(x, y)
    plt.xlabel('x')
    plt.ylabel('f(x)')
    plt.title('Graph of the Function')
    plt.grid(True)
    plt.show()

def trapezoidal_approx(func, a, b, N):
    # h = (b - a) / N
    # # Generate N-1 equally spaced points between a+h and b-h
    # points = np.linspace(a + h, b - h, N - 1)
    # values = func(points)
    # result = (h / 2) * (func(a) + func(b) + 2 * np.sum(values))
    # return result

    dx = (b - a) / N  # Step size
    x = np.linspace(a, b, N+1)  # Equidistant partition points
    return 0.5*dx*np.sum(func(x[:-1]) + func(x[1:]))


if __name__ == "__main__":
    func_1 = lambda x : x/(x**2 + 1)
    antiderivative_1 = lambda x : np.log(x**2 + 1)/2

    func_2 = lambda x : np.exp(x)
    antiderivative_2 = lambda x : np.exp(x)

    a1 = 0; b1 = 1;
    a2 = 0; b2 = 1;

    plot_function(func_1, a1, b1)
    plot_function(func_2, a2, b2)

    N1 = 6
    N2 = 6

    trapezoidal_approx_1 = trapezoidal_approx(func_1, a1, b1, N1)
    trapezoidal_approx_2 = trapezoidal_approx(func_2, a2, b2, N2)

    definite_integral_1 = antiderivative_1(b1) - antiderivative_1(a1)
    definite_integral_2 = antiderivative_2(b2) - antiderivative_2(a2)

    error_1 = np.abs(trapezoidal_approx_1 - definite_integral_1)
    error_2 = np.abs(trapezoidal_approx_2 - definite_integral_2)

    print("Subinterval width = {:0.6f}".format((b1-a1)/N1))
    print("Trapezoidal Approximation for 1st Function = {:0.6f}".format(trapezoidal_approx_1))
    print("Actual Value for 1st Function = {:0.6f}".format(definite_integral_1))
    print("Absolute error for 1st Function = {:0.8f}".format(error_1))
    print()
    print("Subinterval width = {:0.6f}".format((b2-a2)/N2))
    print("Trapezoidal Approximation for 2nd Function = {:0.6f}".format(trapezoidal_approx_2))
    print("Actual Value for 2nd Function = {:0.6f}".format(definite_integral_2))
    print("Absolute error for 2nd Function = {:0.8f}".format(error_2))
