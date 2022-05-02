### REPOSITÓRIO DE ESTUDOS - UFERSA -

_______________________________________________________



#### ALGORITMOS E ESTRUTURA DE DADOS

**O que seria Estrutura de Dados?**  Seria um meio para armazenar e organizar dados de forma a facilitar o acesso e as modificações destes dados. Ela se preocupa tanto com o modo como os dados serão armazenados seja de forma temporária na memória RAM do computador ou mesmo de forma definitiva em uma memória secundária.

**Por que estudarmos a estrutura complexa de dados?** Proporciona a ampliação dos conhecimentos em estruturas de programação a fim de termos maior eficiência computacional, ou seja, algoritmos para resolução de problemas que sejam rápidos e consumam pouca memória.

**IMPORTANTE: **

O estudo de algoritmos e de suas estruturas se faz necessário, portanto, ao profissional da computação,
sendo este determinante para a eficiência dos softwares em diversas aplicações, pois, apesar de termos
hardwares cada vez mais potentes e dotados de capacidade de memória cada vez maior, o processamento degrande quantidade de dados é cada vez mais necessário, daí a necessidade de os programas melhorarem sua eficiência por meio de algoritmos que possam responder a estas exigências

##### Conteúdos:

##### Unidade I

* **Introdução a Estrutura de dados:**
  - **Recursão :** Recursividade é uma técnica que permite que uma função chame a si mesma. Ela nada mais é do que a chamada de uma função diversas vezes com uma condição de parada. Na prática, uma função recursiva chama a si própria até o ponto em que a última forneça uma solução que não seja a chamada a si mesma, passando este valor para as outras funções que a chamaram, resolvendo uma a uma até chegar à primeira, onde teremos um valor final. Para resolvermos um problema recursivo, devemos observar a necessidade de identificar uma condição de parada e os comandos que deverão ser repetitivos, lembrando-nos de fornecer os parâmetros necessários para as chamadas recursivas (passagens de valor). Como vantagem da recursividade, podemos mencionar a simplicidade do código que criamos para a resolução de um programa, gerando um código mais “elegante” e simples, pois podemos eliminar muitas variáveis e códigos que seriam necessários em uma solução sem o uso da recursividade. Porém, a recursividade gera uma “pilha” de funções a serem executadas, resultando na ocupação de mais memória no computador. 

    - Uma **função** é um bloco contendo várias instruções, onde podemos receber um ou mais valores de quem a chamou, bem como enviar um ou mais valores como resposta. As funções podem receber valores por valor e por referência, sendo: 
      - Passagem por Valor: Quando o valor de uma variável é copiado para outra variável, preservando o valor original da variável inicial.
      - Passagem por Referência: Quando passamos a variável para uma função, que tem seu valor alterado. Trabalharemos adiante com este tipo de passagem.

  - **Estrutura de dados heterogêneos (Registros): **  Registro é uma estrutura na qual podemos
    receber dados de diversos tipos que são logicamente relacionados. Um registro é um tipo especial de variável. Podemos dizer que é um conjunto agrupado de variáveis. Podemos afirmar que um registro deve ser definido inicialmente como um tipo específico, um conjunto de variáveis (campo) e seus tipos de dados. Depois de definido o tipo, definimos uma variável como do tipo
    registro. Assim, temos a definição de variável do tipo registro. Podemos ter também estruturas de vetores e matrizes fazendo parte de um registro. Onde ao declaramos o registro como uma variável, apenas criamos um registro. Para termos diversos registros, devemos criar diversas instâncias dessa variável (Segundo exemplo do caderno). Uma vez criadas, podemos manipular tais estruturas. As operações que podemos executar são: 

    - **Inclusão de Registro:** Inclui informações para um novo registro, como os dados de um novo cliente.
    - **Busca de um registro:** Localiza um registro específico fornecendo um parâmetro pela busca, como buscar o registro de "Luiz Carlos André da Silva" (exemplo da apostila).
    - **Exclusão de um registro:** Exclui as informações de um registro, como eliminar determinado registro.

    Além dessas operações básicas, podemos fazer uma série de outras operações, como somar valores, alterar dados de um registro, ordenar os registros seguindo uma ordem, dentre outras.

    ​

  **OBS:**

  As estruturas de dados que já conhecemos, que são os vetores, matrizes e registros, podem ser consideradas estruturas de tamanho fixo, pois apresentam tamanho previamente definido.

  ​

  - **Lista Ligada:** Para termos uma sequência na qual o número
    de elementos possa ser colocado na medida em que necessitamos armazená-los são necessárias outras estruturas, como as Listas Ligadas ou listas encadeadas. Uma lista é uma sequência de elementos na qual podemos manipular tais elementos por meio de operações, como adição de novos elementos ou exclusão de elementos em qualquer posição. Com o uso das listas, é possível trabalhar a inserção ou exclusão de elementos de forma dinâmica de acordo com nossas necessidades. Em uma lista, podemos inserir ou excluir novos elementos de forma dinâmica sem que isso exija controle “extra”. As listas também podem possuir tamanho “finito” (como os vetores) ou “infinito”, quando os elementos são limitados apenas pela capacidade de memória da máquina. Para que isto seja possível, uma lista é composta no mínimo por dois campos, onde o primeiro é o conteúdo da lista e o segundo aponta parao próximo elemento da lista. Cada elemento de uma lista tem a característica de indicar quem é o próximo da lista. Os elementos das listas sempre apontam para um novo elemento. Toda lista começa como vazia, ou seja, com apenas um apontador (também chamado cabeça da lista), que pode ser sem valor algum, posteriormente
    novos elementos serão acrescentados. Cada elemento da lista recebe o nome de nó. Na prática, cada nó possui o endereço de memória de outro nó, fazendo a ligação entre os nós. O endereço de memória do próximo nó é denominado “ponteiro” e se refere não ao conteúdo, mas ao endereço físico em que um nó poderá ser encontrado na memória. Tal artifício confere à lista a capacidade de ser incrementada sempre até o limite de memória da máquina. Uma lista deve possuir um nome, que sempre é seguido do primeiro ponteiro, que aponta para o próximo nó da lista. Os nós não possuem nomes explícitos, apenas nomes implícitos, sendo o nome de cada nó o mesmo do ponteiro que aponta para ele.

    - **Operações com Listas:**

      - Criação e inclusão em uma lista.
      - Inclusão de um nó em qualquer lugar da lista
      - Remoção de nós em uma lista
      - Operações com listas: Podemos unir duas ou mais listas, formando uma lista única;
      - Cópia de uma lista: Uma lista poderá ser copiada, formando uma nova lista idêntica à inicial;
      - Ordenação de uma lista: Ordenar uma lista segundo algum critério;
      - Exclusão de uma lista: Assim como na criação, uma lista pode ser excluída por inteiro, liberando o espaço de memória antes ocupado.

    - **Outros tipos de Listas:**

      - As listas ligadas, ou encadeadas, sofreram algumas variações. As mais encontradas na literatura são:

        - Listas Duplamente Ligadas: Neste tipo de lista, um nó possui endereços dos elementos que lhe são anterior e subsequente. Este tipo de lista facilita o trabalho quando desejamos percorrer uma lista qualquer, pois permite irmos adiante ou recuarmos nos nós da lista.

      - Listas circulares:

        - Neste tipo de lista, o endereço do último nó não é um valor “nulo”, mas o valor do endereço do primeiro nó. Este tipo de lista permite uma trajetória contínua dentro da própria lista. Outra variação desta lista é a duplamente ligada circular. Na prática, o que muda na implementação destas, listas em relação às circulares, é que devemos ter dois campos para endereço em um nó: um campo para o endereço do nó posterior e um campo para o endereço do nó anterior, ligando as estruturas conforme desejado.

      - **Vantagens e desvantagens das listas:**

        Podemos perceber que uma lista é muito semelhante a um vetor. Porém, o fato de a lista não ter um valor fixo de elementos e poder receber quantos elementos pudermos alocar em uma memória nos dá a flexibilidade de trabalharmos a quantidade de elementos de acordo com nossas necessidades, evitando uma possível alocação de memória sem necessidade, comum quando definimos um vetor. 

        Na lista, também temos a manipulação dos elementos de forma mais simples, bastando que realoquemos os endereços contidos nos nós de uma lista. Porém, ao tentarmos encontrar um elemento qualquer em uma lista, devemos buscar em cada elemento o endereço do próximo até encontrar o valor desejado, ao contrário de um vetor, no qual o acesso aos elementos pode ser realizado diretamente, simplesmente fazendo referêcia aos índices.

* **Aplicações das Estruturas de Dados**:
  - Pilha: Pilha é uma estrutura de dados na qual os elementos são colocados um sobre o outro e só é possível retirar o último elemento colocado na estrutura, de modo que todas as operações com uma estrutura de pilha são realizadas apenas no topo da estrutura. LIFO (Lest In First Out), ou seja “o último a entrar é o primeiro a sair”.

    - Operações com Pilhas:

      1. Criação da Pilha: Cria uma pilha vazia, ou seja, cria a estrutura do tipo pilha.
      2.  Inserção na Pilha (PUSH): Operação para inserir um elemento na pilha.
      3. Exclusão na Pilha (POP): Operação de eliminar um elemento do topo da pilha.
      4. Verifica Pilha (TOP): Operação de consulta do elemento do topo da pilha.

    - Importância da Pilha:

      As pilhas são usadas para a implementação da recursividade, quando temos o “empilhamento” das chamadas e a execução da última chamada e sua resolução, que passa a resolver as anteriores uma a uma, de acordo com a ordem em que foram empilhadas.
      Com a estrutura das pilhas, podemos simplificar algumas operações. Por exemplo: imagine que tenhamos um conjunto de dados {0,1,2,3,4,5} e desejemos inverter esses dados. Para isso, basta inserir o conjunto em uma pilha: seguindo a mesma sequência, teríamos {5,4,3,2,1,0}.
      Além dessas aplicações, podemos utilizar a estrutura das pilhas para avaliar sentenças matemáticas, como a avaliação sobre a ordenação correta de estruturas de expressões matemáticas, como, por exemplo:
      {5*[2+(4+6)*3]-4}.

      ​

  - Fila:  Uma fila é uma estrutura na qual colocamos os dados em uma ordem de forma que o primeiro a chegar é o primeiro a sair. Assim, em uma estrutura de fila o primeiro a entrar é o primeiro a sair, do inglês “First in first out” (FIFO).
    Esta estrutura permite o ordenamento de tarefas a ser executadas levando em consideração a ordem de chegada de cada tarefa. Esta estrutura se diferencia de uma pilha, onde o primeiro a entrar é o último a sair.

    - Operações em uma Fila:

      1. Criação de uma fila: Uma estrutura de uma fila pode ser criada sem elemento. Neste caso, a fila terá apenas o elemento inicial.
      2. Inserção em uma fila: Um elemento só pode ser adicionado no topo de uma fila, ou seja, no fim da fila.
      3. Remoção em uma fila: Só podemos remover o primeiro elemento de uma fila.
      4. Estado de uma fila: Uma consulta para sabermos se a fila possui algum elemento ou está cheia.

    - Importância das Filas: 

      A fila é uma forma de organização de dados por meio de um critério de chegada, que pode ser implementado também em sistemas operacionais visando o controle do processamento de tarefas, se não houver restrição de tempo para os processos. Também podemos citar as filas de impressão, por meio das quais você pode enviar diversos documentos que são impressos segundo a ordem de chegada.

      Também vemos o uso das filas para ordenar ações no computador. O maior exemplo disso talvez seja a ordem das teclas pressionadas e a forma como elas aparecem na sequência digitada em um editor de texto. Este evento fica claro quando o processador está com excesso de tarefas e “trava” o editor de texto, sendo que após as tarefas do processador serem executadas, as letras que estavam armazenadas em uma estrutura de fila serão mostradas de acordo com a sequência digitada.

      A estrutura de fila também pode ser utilizada para simulações de uma situação real, como a própria fila de um banco ou uma fila em um engarrafamento de automóveis. Podemos simular diversos eventos com essa estrutura seguindo seus algoritmos.

  - Árvore : Uma árvore é uma estrutura na qual os elementos têm uma origem, um elemento principal, denominado raiz ou pai (ou Nó Raiz), e a partir deste elemento principal outros elementos podem existir. Tais elementos são denominados filhos (ou folhas). A linha que liga os nós pai e filhos são chamados arestas ou arcos. Cada nó da
    árvore poderá ter uma “sub-árvore” abaixo. Cada nó que possui arestas ligando-o a outros nós é o pai destes, que, por sua vez, são os filhos do pai. Quanto aos filhos, quando um nó está ao lado do outro são chamados de irmãos. Os nós filhos que não são pais são chamados nós terminais (ou folha). Desta forma, as árvores são estruturas ideais para a representação de estruturas hierárquicas, como, por exemplo, uma árvore genealógica de uma família. Outro exemplo prático de árvore é a estrutura de armazenamento em pastas adotada pelo sistema operacional, pois forma uma árvore hierárquica de pastas que podem ou não conter arquivos. Um detalhe interessante é que as árvores são recursivas, ou seja, primeiramente são avaliados os nós mais
    distantes do pai até chegar ao pai. Assim, é comum representarmos equações matemática através das árvores, como, por exemplo, a expressão (14-10) * (3+5)+8. Uma árvore também pode ser vista como uma representação de conjuntos. Esta analogia de árvore como um conjunto deixa claro que para resolvermos um problema, devemos primeiramente resolver cada um dos problemas mais internos, ou seja, os subconjuntos.

    - Ávore Binária:  Uma árvore é classificada como binária quando seus nós filhos só poderão ter no máximo dois outros nós filhos.
    - Operações com Árvores Binárias:
      1. Criar árvore: Criação de uma árvore vazia;
      2. Inserir elementos: Insere elementos em uma árvore;
      3. Excluir elementos: Exclui um elemento de uma árvore;
      4. Status da árvore: Mostra a situação da árvore no momento;
      5. Pesquisa elementos: Recupera valores em uma árvore;
      6. Percorrer árvore: Percorre uma árvore.
    - Inserção em uma ávore binária: Para inserirmos elementos em uma árvore binária, devemos observar as características desta árvore e seguir esta regra:
      1. O primeiro elemento será o elemento raiz;
      2. O segundo elemento será comparado ao elemento raiz. Caso o elemento seja menor do que o elemento raiz, será colocado à esquerda. Se o elemento for maior, será colocado à direita.
      3. Caso o elemento seja igual ao elemento raiz, não será colocado na árvore.
    - Remoção em uma árvore binária: Para removermos um elemento em uma árvore binária, precisamos obedecer sua estrutura. Nesse caso,
      temos três tipos possíveis de remoção.
      1. Remoção de um nó sem filhos: Neste caso, o ponteiro do pai que aponta para o filho que desejamos remover é preenchido com o valor “NULL”, excluindo o elemento filho da estrutura da árvore.
      2. Remoção de um nó com um único filho: Modificamos o ponteiro do pai do nó que possui apenas um filho para o filho diretamente, excluindo o nó que possuía um filho, de modo que o filho ocupará o local do pai.
      3. Remoção de um nó com dois filhos: Devemos procurar o sucessor, este será o nó descendente que está na “sub-árvore” à direita, o nó mais à esquerda desta. Se este não tiver filhos, poderá ser removido para qualquer lugar.
    - Percorrer uma árvore binária: Percorrer uma árvore binária é importante no processo de busca de elementos na estrutura, onde cada nó
      deve ser processado somente uma vez durante o procedimento. Para percorremos uma árvore, podemos usar uma das três estratégias:
      1. Pré-ordem: A partir da raiz, percorremos todos os nós da esquerda e depois da direita;
      2. Pós-ordem: Percorremos todos os nós da esquerda, depois da direita até a raiz;
      3. In-ordem: Percorremos todos os nós da esquerda, raiz e direita.

  - Técnicas de Ordenação: Os algoritmos de ordenação são técnicas que permitem ordenar um conjunto de dados seguindo um parâmetro. Apesar de existirem vários algoritmos de ordenação, apresentaremos apenas os algoritmos Bubblesort, Inserção, Shellsort, Quicksort e Heapsort. Cada um deles possui características que o torna mais ou menos eficiente, dependendo da situação na qual for aplicado. Um algoritmo pode ser considerado eficiente quando leva um tempo mínimo para cumprir a tarefa de ordenar um conjunto de dados.

##### Unidade II e III

* **Técnicas de Estruturas de Dados:**
  - Busca Sequencial
  - Busca Binária
  - **Análise de Algoritmos**
    - Tipos de Complexidade
    - Notação Matemática
    - Escala de Medição
  - **Introdução à Teoria dos Grafos**
    -  Conceitos de Grafos
    -  Modelando Problemas
    -  Relação Grafo e Árvore
    -  Grafos no Cotidiano




_____________________________________________________________



### ESTUDOS DO BOOTCAMP DE ESTRUTURA DE DADOS COM JAVA - DIO 

#### Estrutura de dados em Java - Introdução e Conceitos

**Tipos de Memória:**

* Memória Primária: (RAM) nela os dados são apagados na ausência de energia (VOLÁTIL)
* Memória Secundaria: (ROM E OUTRAS MEMÓRIAS) Ela mantem os dados mesmo na ausência de energia.(NÃO VOLÁTIL).

 **Sobre a memória RAM :** Composta por diversos chips, eles posuem endereços de memoria(regiões da memoria RAM que o SO gerencia). Cada chip é capaz de manter por determinado tempo milhões de bits. 

- Sobre o chip: Com energia (energizado) guarda (1)

- Sem energia: (não energizado) guarda (0);

**Tipos de dados**

| Tipo    | Memória Consumida | Valor Minimo               | Valor Máximo              | Precisão    |
| ------- | ----------------- | -------------------------- | ------------------------- | ----------- |
| boolean | 1 bit             | false                      | true                      | --          |
| byte    | 1 byte            | -128                       | 127                       | --          |
| char    | 2 byte            | '\u0000'                   | '\uffff'                  | --          |
| short   | 2 byte            | -32.768                    | 32.767                    | --          |
| int     | 4 bytes           | -2.147.483.648             | 2.147.483.647             | --          |
| long    | 8 bytes           | -9.223.372.036.854.770.000 | 9.223.372.036.854.770.000 | --          |
| float   | 4 bytes           | -3,4028E + 38              | 3,4028E + 38              | 6-7 dígitos |
| double  | 8 bytes           | -1,7976E + 308             | 1,7976E + 308             |             |



**Atribuição e Referência**

- As atribuições em Java são por cópia de valor sempre;
- Com tipo primitivo(int, float, double, string), copiamos o valor em memória;
- Com objetos copiamos o valor da referência em memória, sem duplicar o objeto;



**Conceito de nó e encadeamento de nó**

- Para trabalhar com estruturas de dados dinamicas, a gente não grava os dados na memoria. Utiliza-se o **NÓ**. 
- Um **Nó** é um espaço na memoria que armazena tanto o dado que queremos, como uma referecia a um nó.
- Encadeamento de nó:

**Generics**

- Lista<String> minhaLista = new Lista<>();

  public class Lista<T>{

  private T t;

  .

  .

  }

  - Contexto:
    - Evitar casting excessivo 
    - Evitar códigos redundantes 
    - Encontrar erros em tempo de compilação 
    - Introduzido desde o Java SE 5.0

--Wildcards--

- Unkknow Wildcards (Unbounded)
- Bounded Wildcards (Upper Bounded/ Lower Bounded)

--Unknown Wildcard-- 

public void imprimeLista(`List<?>lista`){

for(`Object obj: lista`){

System.out.println( obj)

}

}

List<Aluno> minhaLista = new List<Aluno>(); //funcao generica que imprime qualquer coisa. desde que tenha o string implementado. Genericos. 

imprimeLista(minhaLista);



--UpperBounded Wildcard--

public void imprimeLista(List<? extends Pessoa> listaPessoas){

for(Pessoa p: listaPessoas)

System.out.println(p);

}

}

List<Aluno> minhaLista = new List<Aluno>();

imprime(minhaLista);

//SO podemos ter na estrutura de generics (passar) listas de pessoas e descendentes de pessoas (herdeiros). 



--LowerBounded Wildcard--

//Qualquer herdeiro de **Pessoa**, neste metodo ele não irá aceitar (lista de qualquer herdeiro da classePessoa) Só irá aceitar da classe Pessoa para cima. 

public void imprimeLista(List<? super Pessoas> listaPessoa){

for(Pessoa p : listaPessoas){

System.out.println(p);

​    }

}

List<Aluno> minhaLista = new List<Aluno>();

imprimeLista(minhaLista);



**Convenção**

- **K** para "Key", exemplo : Map<K,V>
- **V** para "Value", exemplo : Map<K,V>
- **E** para "Element", exemplo : List<E>
- **T** para "Type", exemplo : Collections#addAll
- ? para quando genérico



**Refatoração da Classe No**

EX_1 :

public class No{

private String conteudo;

private No proximoNo = null

.

.

.

}

EX_1_Como vai ficar:

public class No<T>{

private T conteudo;

private No proximoNo = null

.

.

.

} //vai aceitar o conteudo de qualquer tipo. Vai criar um tipo T generico.



**Pilhas [LIFO: Last In, Frist Out]** 

- LIFO

  - Last in Frist Out
  - O ultimo elemento que entra é o primeiro a sair 

- Método Top (Aqui ele pega só a informação)

  - No meuNo = pilha.top();

    No meuNo = int -> Ref.Nó; (Aqui ele vai receber a referencia do primeiro Nó)

    int numero = meuNo.getInt();

- Método Pop (Aqui ele tira o primeiro "dado" da pilha, a referencia aqui vai mudar)

  - No meuNo = pilha.pop();

    No meuNo = int -> Ref. Nó; (Referencia do todo da fila que será tirado)

    int numero = meuNo.getInt(); (Aqui ela exclui o de cima, pega o primeiro Nó, no entanto, na pilha ele será apagado. ele exclui repassando a referencia de top no Nó logo abaixo )

    int numero = int; ()

- Método Push (Contrario do metodo pop )

  - No meuNo = new No();

    meuNo.setInt(1);

    meuNo -> int | null (Ele vai criar um novo nó e colocará ele no topo da pilha)

    (Fazer a referencia o proximo nó desse novo no apontar pro topo da pilha e gerar uma nova referencia que aponta pro topo da pilha, assim teremos o novo nó incluido na pilha)

- Método isEmpty (Diz se a pilha esta vazia ou não)

  - public boolean isEmpty(){

    if(refNo == null){

    return true;

    }

    return false; 

    }

    (Retorna a pilha ou estrutura de dados - verifica a referencia de entrada esta nula. Caso a referencia de no for null ela retornará true)

