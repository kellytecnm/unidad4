#Gráfica de Fibonacci acumulativo: Genera una gráfica de barras donde el
#eje X representa los índices de la serie de Fibonacci y el eje Y la suma
#acumulada de los términos hasta ese índice.

import matplotlib.pyplot as plt
def grafica_fibonacci_acumulativa():
    n = int(input("Ingresa cuántos términos de Fibonacci deseas graficar: "))
    fib = [0, 1]
    for _ in range(2, n):
        fib.append(fib[-1] + fib[-2])
    suma_acumulada = [sum(fib[:i + 1]) for i in range(n)]

    plt.bar(range(n), suma_acumulada)
    plt.xlabel("Índice de Fibonacci")
    plt.ylabel("Suma acumulativa")
    plt.title("Suma acumulativa de la serie de Fibonacci")
    plt.show()
grafica_fibonacci_acumulativa()
