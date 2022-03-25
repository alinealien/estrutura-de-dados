### Algoritmo e Estutura de Dados II



#### Atividade I - PILHAS

1.  Suponha uma pilha  com capacidade de 5 elementos inteiros. Como estará a pilha ao final dessas operações?
   - Push (100)
   - Push (25)
   - Pop()
   - Push (35)
   - Push (45)
   - Pop ()
   - Pop ()
   - Push (50)
   - Push (200)
   - Push (250)



Resposta:

**Push (100)**

| 5    |      |
| ---- | ---- |
| 4    |      |
| 3    |      |
| 2    |      |
| 1    |      |
| 0    | 100  |



**Push (25)**

| 5    |      |
| ---- | ---- |
| 4    |      |
| 3    |      |
| 2    |      |
| 1    | 25   |
| 0    | 100  |

**Pop()**

| 5    |      |
| ---- | ---- |
| 4    |      |
| 3    |      |
| 2    |      |
| 1    |      |
| 0    | 100  |

**Push(35)**

**Push(45)**

| 5    |      |
| ---- | ---- |
| 4    |      |
| 3    |      |
| 2    | 45   |
| 1    | 35   |
| 0    | 100  |



**Pop()**

**Pop()**

| 5    |      |
| ---- | ---- |
| 4    |      |
| 3    |      |
| 2    |      |
| 1    |      |
| 0    | 100  |



**Push (50)**

**Push(200)**

**Push(250)**

| 5    |      |
| ---- | ---- |
| 4    |      |
| 3    | 250  |
| 2    | 200  |
| 1    | 50   |
| 0    | 100  |



#### Atividade I - FILAS

1. Suponha uma fila de espera de pacientes em um consultório médico. Mostre a fila passo a passo de acordo com as operações.
   - Inserir(João)
   - Inserir(Geraldo)
   - Remover()
   - Inserir(Marta)
   - Inserir(Roberta)
   - Remover()
   - Remover()
   - Inserir(Gustavo)
   - Inserir(Isabela)
   - Remover()



- Resposta:

  Adicionou:

  João

  Geraldo

  

  Removeu()

  Ficou:

  Geraldo

  

  Adcionou:

  Geraldo

  Marta

  Roberta

  

  Removeu()

  Removeu()

  

  Ficou:

  Roberta

  

  Adcionou:

  Gustavo

  Isabela

  

  Ficou:

  Roberta

  Gustavo

  Isabela

  

  Removeu()

  Gustavo e Isabela (final)