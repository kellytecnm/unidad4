#Números amigables: Escribe un programa para determinar si dos
#números dados son amigables (la suma de los divisores de uno es igual al
#otro y viceversa).

def suma_divisores(n):
    return sum(i for i in range(1, n // 2 + 1) if n % i == 0)
def numeros_amigables():
    print("Ingresa dos números:")
    a = int(input("Número 1: "))
    b = int(input("Número 2: "))
    if suma_divisores(a) == b and suma_divisores(b) == a:
        return f"{a} y {b} son números amigables."
    else:
        return f"{a} y {b} no son números amigables."
print(numeros_amigables())
