"""
Dados dois números inteiros positivos i e j diferentes de 0,
imprimir todos os divisores comuns de i e j.
Ex.: i = 2 e j = 3 a saída é 1
Ex.: i = 9 e j = 21 a saída é 1, 3
"""
i = int(input("Digite o primeiro número: "))
j = int(input("Digite o segundo número: "))
cont = 0

if j > i:
    cont = j
else:
    cont = i
for x in range(1, cont+1):
    if (i % x == 0) and (j % x == 0):
        print(x)
