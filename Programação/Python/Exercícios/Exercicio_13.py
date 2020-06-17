#Peça para o usuário entrar com o início e o fim da tabuada
#e imprima a tabuada correspondente dentro dos intervalos considerados
#Exemplo:
#Começo = 1
#Fim = 3
#
#Para o 1:
#1x1=1
#1x2=2
#1x3=3
#
#Para o 2:
#2x1=2
#2x2=4
#2x3=6

comeco = int(input("Entre com o primeiro número: "))
fim = int(input("Entre com o segundo número: "))
for i in range(comeco,fim+1):
	for j in range(comeco,fim+1):
		print(i, "x", j, "=", i*j)

