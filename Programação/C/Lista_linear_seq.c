/******************************************************************************
// listaSequencial.c
// Este programa gerencia listas lineares sequenciais.
// As listas gerenciadas podem ter MAX elementos (posicoes de 0 a MAX-1 no
// arranjo A). Alocamos MAX+1 posições no arranjo para possibilitar a 
// criação de um elemento sentinela.
//
// Para entendimento de como a Modelagem em C será feita cabe saber o seguinte:
// elementos = conteúdo de cada espaço de memória na lista
// j = a quantidade de elementos válidos na lista e
// i = a posição de cada elemento válido na lista
******************************************************************************/

//Importação de bibliotecas
#include <stdio.h>

//Declaração de constantes
#define MAX 50 //constante que define o número máximo de elementos no arranjo/lista
#define ERRO -1
#define true 1
#define false 0

//Declaração das variáveis
typedef int bool;
typedef int TIPOCHAVE; //define o registro chave

typedef struct {
	TIPOCHAVE chave;
	//  outros campos ou registros...
} REGISTRO;


typedef struct {
	REGISTRO A[MAX+1];
	int nroElem; //número de elementos na lista, limitados ao teto
} LISTA;

//As funções:

//Inicia a lista
void iniciaLista(LISTA* l) {
	l->nroElem = 0;
}

//Retornar a quantidade de elementos válidos
int tamanho(LISTA* l) {
	return l->nroElem;
}

//Exibir os elementos da lista
void exibirLista(LISTA* l) {
	//declaração de variável
	int i;
	
	//comandos de impressão
	printf("Elementos da Lista: \" ");

	//núcleo do código. Dica de laço For em: http://linguagemc.com.br/a-estrutura-de-repeticao-for-em-c/
	for (i=0; i < l->nroElem; i++)
		printf("%i ", l->A[i]);
	
	printf("\"\n");
}

//Exibir o número de elementos válidos da lista
void exibirTamLista(LISTA* l) {
	printf("Elementos válidos da lista: %i \n", l->nroElem);
	printf("\n");
}

// Busca sequencial em lista ordenada ou não SEM SENTINELA
int buscaSequencial(LISTA* l, TIPOCHAVE ch) {
  int i = 0;
  while (i < l->nroElem){
    if(ch == l->A[i].chave) return i; // achou
	else i++;
  }
  return ERRO; // não achou
} /* buscaSequencial */

// Inserção de um elemento da lista em uma posição específica
bool inserirElemLista(LISTA* l, REGISTRO reg, int i){
  int j;
  if ((l->nroElem >= MAX) || (i < 0) || (i > l->nroElem)) 
     return(false); // lista cheia ou índice inválido
  for (j = l->nroElem; j > i; j--) l->A[j] = l->A[j-1];
  l->A[i] = reg;
  l->nroElem++;
  return true;
} /* inserirElemLista */

/* Exclusão do elemento cuja chave seja igual a ch */
bool excluirElemLista(LISTA* l, TIPOCHAVE ch) { 
  int pos, j;
  pos = buscaSequencial(l,ch);
  if(pos == ERRO) return false; // não existe
  for(j = pos; j < l->nroElem-1; j++) l->A[j] = l->A[j+1];
  l->nroElem--;
  return true;
} /* excluirElemLista */

//A função principal
int main(){
	//Declaração de uma variável lista do tipo Lista
	LISTA lista;

	//Agora vamos iniciar a lista:

	//Inicia a Lista passando como parâmetro o seu endereço de memória
	iniciaLista(&lista);
	//Exibe a lista
	exibirLista(&lista);
    //Exibe o número de elementos da lista
	exibirTamLista(&lista);
	

	//Agora vamos usar a lista:
    //Primeiro, inclusão de elementos
	
	//Declara uma variável reg do tipo REGISTRO
	REGISTRO reg;
	
	//Atribui valor ao atributo chave do REGISTRO
  	reg.chave = 9;
	//Insere o atributo chave do REGISTRO na lista  
  	inserirElemLista(&lista,reg,0);
	//Exibe a lista
	exibirLista(&lista);
    //Exibe o número de elementos da lista
	exibirTamLista(&lista);


	//Atribui valor ao atributo chave do REGISTRO
	reg.chave=3;
	//Insere o atributo chave do REGISTRO na lista  
    inserirElemLista(&lista,reg,1);
	//Exibe a lista
	exibirLista(&lista);
    //Mostra o número de elementos da lista
	exibirTamLista(&lista);

	//Atribui valor ao atributo chave do REGISTRO
	reg.chave=25;
	//Insere o atributo chave do REGISTRO na lista  
    inserirElemLista(&lista,reg,2);
	//Exibe a lista
	exibirLista(&lista);
    //Mostra o número de elementos da lista
	exibirTamLista(&lista);

	//Segundo, buscar por um elemento
	printf("Chave 25 encontrada na posição: %i da lista A.\n",buscaSequencial(&lista,25));
	//Exibe a lista
	exibirLista(&lista);
    //Mostra o número de elementos da lista
	exibirTamLista(&lista);

    //Terceiro, excluir um elementos
    if (excluirElemLista(&lista,10)) printf("Exclusão bem sucedida: 10.\n");
	else printf("Elemento não localizado: 10.\n");
	//Exibe a lista
	exibirLista(&lista);
    //Mostra o número de elementos da lista
	exibirTamLista(&lista);

	if (excluirElemLista(&lista,25)) printf("Exclusão bem sucedida: 25.\n");
	else printf("Elemento não localizado: 25.\n");
	//Exibe a lista
	exibirLista(&lista);
    //Mostra o número de elementos da lista
	exibirTamLista(&lista);
}
	