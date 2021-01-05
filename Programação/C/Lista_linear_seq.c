/******************************************************************************
//     listaSequencial.c
// Este programa gerencia listas lineares sequenciais.
// As listas gerenciadas podem ter MAX elementos (posicoes de 0 a MAX-1 no
//   arranjo A). Alocamos MAX+1 posicoes no arranjo para possibilitar a 
//   criacao de um elemento sentinela.
******************************************************************************/

//Importação de bibliotecas
#include <stdio.h>

//Declaração de constantes
#define MAX 50 //constante que define o número máximo de elementos no arranjo/lista
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

//Funções:

//Inicia a estrutura
void iniciaLista(LISTA* l) {
	l->nroElem = 0;
}

//Retornar a quantidade de elementos válidos

int tamanho(LISTA* l) {
	return l->nroElem;
}

//Exibir os elementos da estrutura

void exibirLista(LISTA* l) {
	//declaração de variável
	int i;

	//comandos de impressão
	printf("Lista: \" ");

	//núcleo do código
	for (i=0; i < l->nroElem; i++)
		printf("%i ", l->A[i]);
	
	printf("\"\n");
}

/* Inserção "direta" na iésima posição (posição i do arranjo A).
   Funciona da mesma maneira de um insertionSort: deve-se deslocar todos os
   elementos a partir da iésima posição e entao se insere o novo elemento. */
bool inserirElemLista(LISTA* l, REGISTRO reg, int i){
  int j;
  if ((l->nroElem >= MAX) || (i < 0) || (i > l->nroElem)) 
     return false; // lista cheia ou índice inválido
  for (j = l->nroElem; j > i; j--) l->A[j] = l->A[j-1];
  l->A[i] = reg;
  l->nroElem++;
  return true;
} /* inserirElemLista */

//Função principal

int main(){
	LISTA lista;
	iniciaLista(&lista);
	exibirLista(&lista);
	printf("Numero de elementos na lista: %i.\n",tamanho(&lista));
	REGISTRO reg;
  	reg.chave = 9;
  	inserirElemLista(&lista,reg,0);
  	exibirLista(&lista);
	printf("Numero de elementos na lista: %i.\n",tamanho(&lista));
}