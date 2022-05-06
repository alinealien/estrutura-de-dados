Algoritmo "buscasequencial"
// Disciplina   : [Algoritmos e Estrutura de Dados]
// Professor   : Paulo Henrique
// Descrição   : Exemplo de Algoritmo de Busca Sequencial
// Autor(a)    : Aline Antunes
// Data atual  : 30/04/2022
var
// Seção de Declarações das variáveis 
j, k, vb : inteiro
v : vetor[1..10] de inteiro
achou : logico

procedimento preenchevetor
// Preenche o vetor com numeros aleatorios entre 0 e 100
var j : inteiro
inicio
para j de 1 ate 10 faca
v[j] <- randi (100)
escreval(j:5, v[j]:5)
// :5 escreve o valor das variáveis em 5 espaços alinhados e a direita
fimpara
fimprocedimento

inicio

preenchevetor
escreva("Entre com o valor de Busca (ESC termina) :")
leia(vb)
// Busca sequencial em vetores (alocação estatica)
j <- 1
repita
se v[j] = vb entao
achou <- verdadeiro
senao
j <- j+1
fimse
ate (achou=verdadeiro) ou (j>10)
se achou entao
escreval("Achei ", vb, " na posição", j)
senao
escreval("Não achei.")
fimse


fimalgoritmo