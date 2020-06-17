# 5! = 5x4x3x2x1
n = int(input("Digite um número inteiro e maior do que zero: "))
mult = 1
for cont in range(n, 1, -1):
    print(cont)
    mult *= cont
print("O fatoral de %i é"%n, mult)
