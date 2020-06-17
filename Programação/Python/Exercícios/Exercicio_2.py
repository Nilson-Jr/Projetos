#Faça um programa que peça as quatro notas bimestrais de um aluno e mostre a media.
Primeira_Nota = input("Digite a primeira nota do aluno: ")
if type(Primeira_Nota) == str:
    print("Você tem que entrar com valores de 0 a 10")
    exit    
Primeira_Nota = int(input("Digite a primeira nota do aluno: "))
Segunda_Nota = int(input("Digite a segunda nota do aluno: "))
Terceira_Nota = int(input("Digite a terceira nota do aluno: "))
Quarta_Nota = int(input("Por fim, digite a quarta nota do aluno: 6"))
print("A média bimestral do aluno foi: ", (Primeira_Nota+Segunda_Nota+Terceira_Nota+Quarta_Nota)/4)
