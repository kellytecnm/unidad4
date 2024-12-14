#Sumas parciales de Fibonacci: Implementa un algoritmo para calcular la
#suma de los primeros N términos de la serie de Fibonacci.

def sumafibonacci():

    n = int(input("Ingresa cuántos términos de Fibonacci sumar: "))


    if n <= 0:
        return "Por favor, ingresa un número mayor a 0."

    fib = [0, 1]
    for _ in range(2, n):
        fib.append(fib[-1] + fib[-2])

    suma = sum(fib[:n])
    return f"La suma de los primeros {n} términos de Fibonacci es {suma}."


resultado = sumafibonacci()
print(resultado)
