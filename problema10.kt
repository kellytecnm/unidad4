#Cálculo numérico de integrales: Diseña una función para calcular la
#integral definida de una función en un intervalo utilizando el método del
#trapecio.

from sympy import symbols, diff, solve

def integral_trapecio(f, a, b, n=1000):
    h = (b - a) / n
    s = 0.5 * (f(a) + f(b))
    for i in range(1, n):
        s += f(a + i * h)
    return s * h

print(integral_trapecio(lambda x: x**2, 0, 3))
