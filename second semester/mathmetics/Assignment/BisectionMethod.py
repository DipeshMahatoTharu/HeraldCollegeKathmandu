import numpy as np
import scipy.optimize as opt
import matplotlib.pyplot as plt

def plot_function(func, a, b):
    x = np.linspace(a, b, 1000)
    y = func(x)
    plt.figure(figsize=(8, 6))
    plt.plot(x, y, label='f(x)')
    plt.xlabel('x')
    plt.ylabel('f(x)')
    plt.title('Plot of the given function')
    plt.grid(True)
    plt.legend()
    plt.show()

def bisection_method(func, a, b, tol=1e-6, max_iter=100):
    #checking if the functional values of interval provide both same sign values
    if a>b and func(a) * func(b) >= 0:
        raise ValueError("The function values at the interval endpoints must have opposite signs.")
    
    iter_count = 0
    while iter_count < max_iter:
        c = (a + b) / 2
        #checking og the functional value of c is close to 0 or the interval has converged
        if abs(func(c)) < tol or abs(b - a) < tol:
            return c
        iter_count += 1
        #if c is negative replace it with a, is positive replace it with b
        if func(c) * func(a) > 0:
            a = c
        else:
            b = c
            
    print("Warning! Exceeded the maximum number of iterations.")
    return None

if __name__ == "__main__":
    func1 = lambda x: x**2 - x - 1
    func2 = lambda x: x**3 - x**2 - 2*x + 1
    
    plot_function(func1, -2, 3)
    plot_function(func2, -2, 3)

    a_1, b_1 = 1, 2
    a_2, b_2 = -2, 0
    
    our_root_1 = bisection_method(func1, a_1, b_1)
    our_root_2 = bisection_method(func2, a_2, b_2)
    
    sp_root1 = opt.root(func1, 1.5).x[0]
    sp_root2 = opt.root(func2, -1.5).x[0]
    
    print("Roots found by bisection method for function 1: ", our_root_1)
    print("Roots found by scipy.optimize.root for function 1: ", sp_root1)
    print("Roots found by bisection method for function 2: ", our_root_2)
    print("Roots found by scipy.optimize.root for function 2: ", sp_root2)
