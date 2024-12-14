#Fibonacci y primos: Encuentra el número más cercano a un índice N en
#la serie de Fibonacci que también sea primo.

def esprimo(num):
    if num < 2:
        return False
    for n in range(2, int(num**0.5) + 1):
        if num % n == 0:
            return False
    return True

def fibonacciprimocercano(n):
    fib = [0, 1]
    for _ in range(2, n + 1):
        fib.append(fib[-1] + fib[-2])
    for n in range(n, -1, -1):
        if esprimo(fib[n]):
            return fib[n]

print(fibonacciprimocercano(10))
