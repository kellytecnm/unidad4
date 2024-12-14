#Simulación de ondas: Dibuja la superposición de dos ondas.

import numpy as np
import matplotlib.pyplot as plt


def simulacion_ondas():
    print("Para la primera onda:")
    amp1 = float(input("Ingresa la amplitud: "))
    freq1 = float(input("Ingresa la frecuencia: "))
    print("Para la segunda onda:")
    amp2 = float(input("Ingresa la amplitud: "))
    freq2 = float(input("Ingresa la frecuencia: "))
    t = np.linspace(0, 2 * np.pi, 1000)
    onda1 = amp1 * np.sin(freq1 * t)
    onda2 = amp2 * np.sin(freq2 * t)
    superposicion = onda1 + onda2
    plt.plot(t, onda1, label="Onda 1", alpha=0.7)
    plt.plot(t, onda2, label="Onda 2", alpha=0.7)
    plt.plot(t, superposicion, label="Superposición", color='black', linewidth=1.2)
    plt.title("Simulación de ondas")
    plt.xlabel("Tiempo")
    plt.ylabel("Amplitud")
    plt.legend()
    plt.grid()
    plt.show()
simulacion_ondas()
