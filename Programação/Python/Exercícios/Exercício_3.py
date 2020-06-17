#Nilson
Valor = int(input("Informe o valor que deseja sacar: "))
if 10 <= Valor <= 600:
    Notas_de_100 = Valor // 100
    Valor = Valor % 100
    print(Valor)

    Notas_de_50 = Valor // 50
    Valor = Valor % 50
    print(Valor)

    Notas_de_10 = Valor // 10
    Valor = Valor % 10
    print(Valor)

    Notas_de_5 = Valor // 5
    Valor = Valor % 5
    print(Valor)

    Notas_de_1 = Valor // 1
    Valor = Valor % 1
    print(Valor)
    
    if Notas_de_100 > 0:
        print("Notas de R$- 100: ", Notas_de_100)
    if Notas_de_50 > 0:
        print("Notas de R$- 50: ", Notas_de_50)
    if Notas_de_10 > 0:
        print("Notas de R$- 10: ", Notas_de_10)
    if Notas_de_5 > 0:
        print("Notas de R$- 5: ", Notas_de_5)
    if Notas_de_1 > 0:
        print("Notas de R$- 1: ", Notas_de_1)
else:
    print("Não é possível fazer o saque")
    


