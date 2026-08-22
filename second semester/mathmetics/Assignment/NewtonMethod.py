import math
import numpy as np
import scipy as sp
import matplotlib.pyplot as plt

def plot_function(func, a, b):
    x = np.linspace(a, b, 1000)
    y = func(x)
    plt.plot(x, y)
    plt.xlabel('x')
    plt.ylabel('f(x)')
    plt.title('Plot of the Function')
    plt.grid(True)
    plt.show()

def newton_method(func, grad, x0, tol=1e-6, max_iter=100):
    iter_count = 1
    while iter_count <= max_iter:
        #this may cause zero division error
        if abs(grad(x0)) <= 1e-12:
            print("Mathematical Error! Found root may not be correct.")
            return x0
        
        x1 = x0 - func(x0) / grad(x0)
        x0 = x1
        #checking if the functional value of x0 is close to 0, less than tolerance
        if abs(func(x0)) <= tol:
            return x0
        iter_count += 1
        
    print("Warning! Method exceeded maximum number of iterations.")
    return x0

if __name__ == "__main__":
    func1 = lambda x: x**2 - x - 1
    grad1 = lambda x: 2*x - 1

    func2 = lambda x: x**3 - x**2 - 2*x + 1
    grad2 = lambda x: 3*x**2 - 2*x - 2
    
    plot_function(func1, -2, 2)
    plot_function(func2, -2, 2)
    
    x0 = 0
    our_root_1 = newton_method(func1, grad1, x0)
    sp_result_1 = sp.optimize.root(func1, x0)
    sp_root_1 = sp_result_1.x.item()
    
    x0 = 0
    our_root_2 = newton_method(func2, grad2, x0)
    sp_result_2 = sp.optimize.root(func2, x0)
    sp_root_2 = sp_result_2.x.item()

    print("1st root found by Newton's Method for x^2 - x - 1 = {:0.8f}.".format(our_root_1))
    print("1st root found by SciPy for x^2 - x - 1 = {:0.8f}".format(sp_root_1))

    print("1st root found by Newton's Method for x^3 - x^2 - 2x + 1 = {:0.8f}.".format(our_root_2))
    print("1st root found by SciPy for x^3 - x^2 - 2x + 1 = {:0.8f}".format(sp_root_2))
