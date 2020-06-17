num = int(input("Digite um número inteiro menor do que 1000: "))
aux = num
if num < 1000:
    centenas = aux // 100
    aux = aux % 100
    
    dezenas = aux // 10
    aux = aux % 10

    unidades = aux // 1
    if num >= 100:
        if centenas > 1:
            if dezenas > 1:
                if unidades > 1:
                    print(num, "=", centenas, "centenas", dezenas, "dezenas e", unidades, "unidades")
                else:
                    print(num, "=", centenas, "centenas", dezenas, "dezenas e", unidades, "unidade")
            if unidades > 1:
                print(num, "=", centenas, "centenas", dezenas, "dezena e", unidades, "unidades")
                       



else:
    print("Você digitou um número invádio.")