#Número de caminos: Calcula el número de caminos posibles en una
#cuadrícula NxN, moviéndose solo hacia la derecha o hacia abajo

from math import comb
def caminos_en_cuadricula():
    n = int(input("Ingresa el tamaño de la cuadrícula (N): "))
    caminos = comb(2 * n, n)
    return f"El número de caminos posibles en una cuadrícula {n}x{n} es {caminos}."
print(caminos_en_cuadricula())
