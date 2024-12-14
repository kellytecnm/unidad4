#Aproximación de derivadas: Implementa una función que calcule la
#derivada de una función en un punto usando diferencias finitas

from sympy import symbols, diff

def derivada_aproximada(f, x, h=1e-5):
    return (f(x + h) - f(x - h)) / (2 * h)

print(derivada_aproximada(lambda x: x**2, 2))
