#Autovalores y autovectores: Escribe un programa para calcular los
#autovalores de una matriz 2x2.

def calcular_autovalores():
    print("Ingresa los coeficientes de la matriz 2x2 (fila por fila):")
    matriz = [list(map(float, input().split())) for _ in range(2)]
    matriz = np.array(matriz)
    autovalores, autovectores = np.linalg.eig(matriz)
    return f"Autovalores: {autovalores}\nAutovectores:\n{autovectores}"
print(calcular_autovalores())
