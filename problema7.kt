#Derivadas simbólicas: Diseña una función que acepte una expresión
#algebraica (por ejemplo, 3x^2 + 2x) y calcule su derivada simbólica.



from sympy import symbols, diff

def derivada_simbolica(expresion):
    x = symbols("x")
    derivada = diff(expresion, x)
    return derivada
expresion: "3*x**2+2*x"
print(derivada_simbolica(expresion))
