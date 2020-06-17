"""
O DEM lhe contratou para desenvolver um programa que leia um conjunto
indeterminado de temperaturas e informe ao final
a menor e a maior temperatura informada, bem como mostre a média das
temperaturas.
"""

num = int(input("Digite o número de temperaturas registradas: "))
soma = maior = menor = float(input("Digite a temperatura 1: "))

for i in range (2, num+1):
    temp = float(input("Digite a temperatura %d: "%i))
    if temp > maior:
        maior = temp
    if temp < menor:
        menor = temp
    soma = temp
print("A maior temperatura é %6.2f °C."%maior)
print("A menor temperatura é %6.2f °C."%menor)
print("A média de todas as temperaturas é %6.2f °C."%(soma/num))