"""
Faça um programa que peça um número e informe se o número é inteiro ou decimal.
Se o número for decimal, arredonde o número.
"""
num = float(input("Digite um número: "))
if num != int(num):
    decimal = num - int(num)
    print(num, "é decimal.")  
else:
    print(num, "é inteiro.")    
if (decimal <= 0.5):
    num = int(num)
else:
    num = int(num) + 1
print((num + decimal), "arredondado é ", num)