#Optimización de funciones: Escribe un programa que encuentre el
#mínimo o máximo de una función cuadrática mediante el cálculo de su
#derivada.

from sympy import solve, diff, symbols

def optimizar_funcion(expresion):
    x = symbols('x')
    derivada = diff(expresion, x)
    criticos = solve(derivada, x)
    return criticos

print(optimizar_funcion("x**2 - 4*x + 4"))
