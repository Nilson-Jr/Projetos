"""
Dado um número n de empresas, e um número m de meses,
e o ganho e gastos positivos e inteiros de cada empresa para cada mes,
imprimir se cada empresa nesses meses ficou com déficit, lucro ou indiferença e imprimir
o valor correspondente a essa banaça.
"""

n = int(input("Digite o número de empresas: "))
m = int(input("Digite o número de meses: "))
print("")
empresa = 1
while empresa <= n:
    mes = 1
    balanco = 0
    print("Empresa", empresa, ":")
    while mes <= m:
        print("Mês", mes, ":")
        ganho = int(input("Digite o GANHO da empresa no mês: "))
        gasto = int(input("Digite o GASTO da empresa no mês: "))
        balanco = balanco + (ganho - gasto)
        print("")
        mes = mes + 1
    if balanco > 0:
            print("A empresa", empresa, "foi positiva em", balanco)
    elif balanco < 0:
            print("A empresa", empresa, "ficou negativa em", balanco)
    else:
            print("A empresa", empresa, "ficou indiferente, ou seja,", balanco)
    empresa = empresa + 1


        

