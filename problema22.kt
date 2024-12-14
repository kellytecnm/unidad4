#Visualización de raíces: Representa gráficamente un polinomio P(x) y
#marca en la gráfica las raíces reales calculadas.

import numpy as np
import matplotlib.pyplot as plt

def visualizar_raices():
    print("Ingresa los coeficientes del polinomio (de mayor a menor grado):")
    coeficientes = list(map(float, input().split()))
    raices = np.roots(coeficientes)
    raices_reales = [r.real for r in raices if np.isreal(r)]
    x = np.linspace(-10, 10, 400)
    y = np.polyval(coeficientes, x)
    plt.plot(x, y, label='Polinomio')
    plt.axhline(0, color='black', linewidth=0.8, linestyle='--')  # Eje x
    for r in raices_reales:
        plt.scatter(r, 0, color='red', label=f"Raíz: {r:.2f}")
    plt.title("Visualización de raíces de un polinomio")
    plt.xlabel("x")
    plt.ylabel("P(x)")
    plt.legend()
    plt.grid()
    plt.show()
visualizar_raices()
