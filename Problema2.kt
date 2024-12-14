#Fibonacci generalizado: Crea una función que reciba dos números
#iniciales y calcule una serie similar a Fibonacci, pero con estos números
#como punto de partida

def fibonaccigeneral():
    a = int(input("Ingresa el primer número inicial: "))
    b = int(input("Ingresa el segundo número inicial: "))
    n = int(input("¿Cuántos términos deseas calcular?: "))


    fib = [a, b]
    for _ in range(2, n):
        fib.append(fib[-1] + fib[-2])
    return fib


resultado = fibonaccigeneral()
print("La serie generada es:", resultado)
