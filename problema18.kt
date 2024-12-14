#Factorización optimizada: Diseña una función para descomponer un
#número en sus factores primos de forma eficiente.

def factorizacion_primos(n):
    factores = []
    divisor = 2
    while n > 1:
        while n % divisor == 0:
            factores.append(divisor)
            n //= divisor
        divisor += 1
    return factores
print("Ingresa un número para factorizar:")
numero = int(input())
print(f"Los factores primos de {numero} son: {factorizacion_primos(numero)}")
