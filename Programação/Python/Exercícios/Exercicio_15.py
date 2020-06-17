"""
Dados n e dois números inteiros positivos i e j diferentes de 0,
imprimir em ordem crescente os n primeiros naturais que são múltiplos
de i ou de j e ou de ambos
Ex.: Para n = 6, i = 2 e j = 3 a saída deverá ser: 0, 2, 3, 4, 6, 8
"""
n = int(input("Digite o valor de n: "))
i = int(input("Digite o valor de i: "))
j = int(input("Digite o valor de j: "))
cont = 0
aux = 0

while aux != n:
    if (cont % i == 0) or (cont % j == 0):
        print(cont)
        aux += 1
    cont += 1    

