#Determinante de una matriz: Crea una función que calcule el
#determinante de matrices de hasta 4x4

def calcular_determinante():
    print("Ingresa el tamaño de la matriz (n x n):")
    n = int(input())
    print(f"Ingresa los elementos de la matriz {n}x{n}:")
    matriz = [list(map(float, input().split())) for _ in range(n)]
    matriz = np.array(matriz)
    determinante = np.linalg.det(matriz)
    return f"El determinante de la matriz es: {determinante:.2f}"
print(calcular_determinante())
