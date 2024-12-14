#Posición en Fibonacci: Escribe una función que determine si un número
#dado pertenece a la serie de Fibonacci. Si pertenece, devuelve su posición.

def posicionfibonacci():

    numero = int(input("Ingresa el número para verificar su posición en la serie de Fibonacci: "))

    a, b, pos = 0, 1, 1
    while a < numero:
        a, b = b, a + b
        pos += 1

    if a == numero:
        return f"El número {numero} está en la posición {pos} de la serie de Fibonacci."
    else:
        return f"El número {numero} no pertenece a la serie de Fibonacci."

resultado = posicionfibonacci()
print(resultado)
