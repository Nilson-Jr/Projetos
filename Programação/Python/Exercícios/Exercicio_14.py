"""
Dado um número inteiro n e vários números inteiros m, estes em tempo de execução,
calcular a soma dos números pares da sequência m.
Considere como ponto de parada da sequência o valor de m = 0

Ex.:
->solicita o número de sequência:
n = 2
->solicita os números da sequencia 1:
m = 5, 6, 7, 10, até o usuário escolher o 0

->imprime
a soma dos números pares da 1 sequência = 16

->Solicita o número da sequência 2:
m = 3, 2, 7, 17, 27, 35, 8, 0

->imprime
a soma dos números pares da 2 sequência = 10
""" 

n = int(input("Entre com o número de sequência: "))
for i in range(n):
    print("Digite os valores da sequência %i"%(i + 1))
    m = int(input("Digite o primeiro número: "))
    soma = 0
    while m != 0:
        if (m % 2 == 0):
            soma = soma + m
        m = int(input("Digite o próximo número: "))
    print("A soma dos números pares da %i sequência é: %i"%(i+1, soma)) 
              

    