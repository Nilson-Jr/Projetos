#Nilson
"""
Dados n e uma seqüência de n números inteiros, determinar quantos seguimentos.
de números iguais consecutivos compõe essa sequencia.

Exemplos:
Na seqüência   5,  2,  2,  3,  4,  4,  4,  4,  1, 1
o seguimento de números iguais máximo é 4.

ant = 5
seg = 1
segMAX = 1
cont = 1
---------------------
prox = 2 (usuário)
2 = 5 ---> ant = prox
---------------------
ant = 2
prox = 3 (usuário)
3 = 2 ---> ant = prox 
---------------------
ant = 3
prox = 4 (usuário)
4 = 3 ----> 
---------------------
ant = 4
prox = 4 (usuário)
4 = 4 ---> seg = seg + 1
---------------------
ant = 4
prox 4 (usuário)
4 = 4 ---> seg = seg + 1
---------------------
ant = 4
prox = 1 (próximo)
1 = 4 ----> seg > segMAX => segMAX = seg => seg = 1
"""
num = int(input("Digite o número máximo a ser usado: "))
ant = int(input("Digite o primeiro número: "))
seg = 1
segMAX = 1
cont = 1
while cont < num:
    prox = int(input("Digite o próximo número: "))
    if prox == ant:
        seg = seg + 1
    else:
        if seg > segMAX:
            segMAX = seg
        seg = 1
    ant = prox
    cont = cont + 1
print("O número máximo de iguais consecutívos é %i"%(segMAX))


