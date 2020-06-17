"""
Macetes do Git:
Se o arquivo já existe, você altera e não salva
Não aparece nada.

Se o arquivo já existe, você altera e salva:
Aparece -> Modified.
Obs: No VSC aparece "M"odified.

Se o arquivo já existe, você altera, salva e adiciona(staged):
Aparece -> staged
Obs.: No VSC aparece "índice" Modified..

Se o arquivo já existe, você altera, salva, adiciona, altera novamente e salva novamente:
Aparece -> Modified/Staged
Obs.: No VSC volta para Modified.

Em todos os estados acima, quando você commitar, apenas os que você já tinha adicionado,
sem novas alterações,voltam ao normal. Os que você tinha alterado, salvado, adicionado,
alterado novamente e salvado novamente, aparecem Modified. Ou seja, quando você
commita só commita o que você já adicionou(staged/indice Modified).
"""

print("Alô mundo")
