#Resolución de sistemas lineales: Implementa una función que resuelva
#un sistema de ecuaciones lineales usando el método de eliminación de
#Gauss.

import numpy as np


def resolver_sistema_gauss():
    n = int(input("Ingresa el número de ecuaciones: "))
    print("Ingresa la matriz de coeficientes:")
    A = [list(map(float, input().split())) for _ in range(n)]
    print("Ingresa los términos independientes:")
    b = list(map(float, input().split()))
    A = np.array(A)
    b = np.array(b)
    try:
        sol = np.linalg.solve(A, b)
        return f"Las soluciones son: {sol}"
    except np.linalg.LinAlgError:
        return "El sistema no tiene solución única."
print(resolver_sistema_gauss())
