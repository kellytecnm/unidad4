#Factorial: Pedir por teclado N y calcular el Factorial de N
#(N! = 1 * 2 * 3 * ... * N)

def calcular_factorial():

    n = int(input("Ingresa un número para calcular su factorial: "))


    if n < 0:
        return "El factorial no está definido para números negativos."

    factorial = 1
    for i in range(2, n + 1):
        factorial *= i

    return f"El factorial de {n} es {factorial}."

resultado = calcular_factorial()
print(resultado)
