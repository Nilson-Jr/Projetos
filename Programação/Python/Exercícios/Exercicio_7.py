n = int(input("Digite o número: "))
cont = 1
while cont * (cont + 1) * (cont + 2) < n:
    cont += 1
if cont * (cont + 1) * (cont + 2) == n:
   print(n, "é um número triangular")
else:
   print(n, "não é um número triangular")