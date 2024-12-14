#Tangente a una curva: Dada una función y un punto, calcula la ecuación
#de la recta tangente en ese punto

from sympy import symbols, diff, solve 

def tangente_a_curva():
    funcion_str = input("Ingresa la función en términos de x (por ejemplo: x**2 + 3*x): ")
    x0 = float(input("Ingresa el punto donde calcular la tangente (x0): "))
    f = lambda x: eval(funcion_str)
    h = 1e-5
    pendiente = (f(x0 + h) - f(x0 - h)) / (2 * h)
    b = f(x0) - pendiente * x0
    print(f"La ecuación de la recta tangente es: y = {pendiente:.5f}x + {b:.5f}")
tangente_a_curva()
