#!/bin/bash
#Executar o rofi a partir do i3. Isto foi necessário porque o i3 não aceitou o comando abaixo quando dentro do seu arquivo de configuração.
#Obs.: o parâmetro que vem logo após o -show indica ao rofi qual dos dois parâmetros passados nno argumento anterior deve ser utilizado por primeiro. 

rofi -modi "window,drun,run" -show window -show-icons
