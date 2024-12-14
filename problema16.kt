#Raíces de polinomios: Diseña un programa que encuentre todas las raíces
#reales de un polinomio de tercer grado.

def encontrar_raices():
    print("Ingresa los coeficientes del polinomio (de mayor a menor grado):")
    coeficientes = list(map(float, input().split()))
    raices = np.roots(coeficientes)
    return f"Las raíces del polinomio son: {raices}"
print(encontrar_raices())
