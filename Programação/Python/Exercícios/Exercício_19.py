"""
Faça um programa que calcule o número médio de alunos por turma.
Para isto peça a quantidade de turmas e a quantidade de alunos
para cada turma. As turmas não podem ter mais de 40 alunos.
"""
soma = 0
turmas = int(input("Digite a quantidade de turmas: "))
for i in range(1, turmas+1):
    qtde = int(input("Digite o número de alunos da turma %d: "%i))
    while qtde > 40 or qtde < 0:
        if qtde > 40:
            qtde = int(input("A quantidade de alunos excede o número permitido. Digite novamente a quantidade de alunos da turma %d: "%i))

        elif qtde < 0:
            qtde = int(input("A quantidade de alunos é inválida. Digite novamente. Digite novamente a quantidade de alunos da turma %d: "%i))
    soma += qtde
print("A média dos alunos é %.10g"%(soma/turmas))
