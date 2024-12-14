#Multiplicación de matrices grandes: Implementa un algoritmo para
#multiplicar dos matrices dispersas eficientemente.


def multiplicar_matrices():
    print("Ingresa el tamaño de la primera matriz (filas columnas):")
    filas_a, columnas_a = map(int, input().split())
    print("Ingresa los elementos de la primera matriz:")
    matriz_a = [list(map(float, input().split())) for _ in range(filas_a)]
    print("Ingresa el tamaño de la segunda matriz (filas columnas):")
    filas_b, columnas_b = map(int, input().split())
    print("Ingresa los elementos de la segunda matriz:")
    matriz_b = [list(map(float, input().split())) for _ in range(filas_b)]
    if columnas_a != filas_b:
        return "No se pueden multiplicar estas matrices."
    matriz_a = np.array(matriz_a)
    matriz_b = np.array(matriz_b)
    resultado = np.dot(matriz_a, matriz_b)
    return f"Resultado:\n{resultado}"
print(multiplicar_matrices())
