"""
Dados n e uma seqüência de n números inteiros, determinar o comprimento de
um segmento crescente de comprimento máximo.

Exemplos:
Na seqüência   5,  10,  3,  2,  4,  7,  9,  8,  5
o comprimento do segmento crescente máximo é 4.

Na seqüência   10,  8,  7,  5,  2
o comprimento de um segmento crescente máximo é 1.
"""
num = int(input("Digite o número máximo da sequência: "))
ant = int(input("Digite o primeiro número: "))
cont = 1
seg = 1
segMAX = 1
while cont < num:
    prox = int(input("Digite o número %i: "%(cont + 1)))
    if prox > ant:
        seg = seg + 1
        segMAX = seg
    else:
        seg = 1
    cont = cont + 1
print("O comprimento máximo dos números fornecidos é: ", segMAX)

