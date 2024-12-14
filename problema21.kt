#Pendiente y tangente: Grafica una función f(x)=x**3 - 4*x**2+ 6*x como y,
#en el mismo gráfico, muestra la recta tangente en un punto dado

import numpy as np
import matplotlib.pyplot as plt


def derivada_aproximada(f, x, h=1e-5):
    """Calcula la derivada aproximada de f en x usando diferencias finitas."""
    return (f(x + h) - f(x - h)) / (2 * h)

def grafica_tangente():
    funcion_str = input("Ingresa la función en términos de x (por ejemplo: x**2 + 3*x): ")
    x0 = float(input("Ingresa el punto donde calcular la tangente: "))
    f = lambda x: eval(funcion_str)
    pendiente = derivada_aproximada(f, x0)
    b = f(x0) - pendiente * x0  # Intersección con el eje y (y = mx + b)
    tangente = lambda x: pendiente * x + b
    x_vals = np.linspace(x0 - 5, x0 + 5, 400)
    y_vals = f(x_vals)
    tangente_vals = tangente(x_vals)
    plt.plot(x_vals, y_vals, label="Función", color="blue")
    plt.plot(x_vals, tangente_vals, '--', label=f"Tangente en x={x0}", color="red")
    plt.scatter([x0], [f(x0)], color="green", zorder=5, label=f"Punto ({x0}, {f(x0):.2f})")
    plt.title("Función y su recta tangente")
    plt.xlabel("x")
    plt.ylabel("y")
    plt.axhline(0, color='black', linewidth=0.8, linestyle="--")
    plt.axvline(0, color='black', linewidth=0.8, linestyle="--")
    plt.legend()
    plt.grid()
    plt.show()

grafica_tangente()
