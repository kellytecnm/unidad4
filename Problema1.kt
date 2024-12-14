#Fibonacci inverso: Implementa una función que calcule los primeros N
#números de la serie de Fibonacci en orden inverso.

def fibonacciinverso(n):
    fib = [0, 1]
    for _ in range(2, n):
        fib.append(fib[-1] + fib[-2])
    return fib[::-1]

print(fibonacciinverso(10))
