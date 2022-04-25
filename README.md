# Fpoo (Fundamentos de Programação Orientado a Objetos)
* https://replit.com/ ==> plataforma de programação em navegadores.
* Clean code ==> código limpo, técnica levada ao pé da letra em Java.

## Variáveis
* Variáveis não podem começar com números ou caracteres especiais, não podem ter acentos e espaços.
* Em Java, para declarar uma variável ou qualquer coisa que seja composta, é usado o formato Camel Case. Ex: TrocaDeVariavel.

Variável é um espaço reservado (alocado) dentro da memória RAM para gravar uma informação de um tipo preestabelecido. Há vários tipos de variáveis em Java:

### Escopo
Escopo de variável = visibilidade

    int n = 0;
    while(n < 10){
        int x = 100; // Variável local
        n++;
    }
    System.out.print(x)

O seguinte programa dará erro, pois a variável ` x ` só existe enquanto o laço ` while ` está em execução.

    int n = 0;
    int x = 0; // Variável global
    while(n < 10){
        x = 100;
        n++;
    }
    System.out.print(x)

O seguinte programa pode ser executado, pois a variável foi declarada fora do laço ` while `, ou seja, ela pode ser alcançada em qualquer local do programa.

### Tipos primitivos
* ` boolean `
* ` char `
* ` byte `
* ` short `
* ` int `
* ` long `
* ` float `
* ` double `

### Numéricos (tipos primitivos)
OBS: Todas as variáveis numéricas são primitivas, ou seja, foram criadas juntas com a linguagem Java. Cada tipo primitivo tem sua classe associada.
* Ordem de Precedência
    * 1º Parênteses
    * 2º Multiplicação e Divisão
    * 3º Soma e Subtração
---
#### Inteiros

Em variáveis do tipo inteiro, a diferença entre elas é o espaço reservado para uso. O tamanho da variável influência no desempenho do seu programa, cada tipo ocupa um espaço diferente. O espaço é dividido entre negativos e positivos. Quando o tamanho da variável alcançar o máximo, ele volta para o começo, ou seja, é "formado" como um ciclo.
* ` byte ` ==> 8 bits 
* ` short ` ==> 16 bits
* ` int ` ==> 32 bit
* ` long ` ==> 64 bits
---
#### Decimais

Em variáveis do tipo decimal seguem as mesmas instruções do tipo inteiro.
* ` float ` ==> 32 bits
* ` double ` ==> 64 bits
---
* Os programadores padronizaram tipos de variáveis numéricas. Int para inteiros e double para decimais, mas quando se trata de sistemas embarcados (possuem pouco espaço) a escolha deve ser feita com cuidado entre os tipos.

## Operadores
### Aritméticos (matemáticos)
* ` + ` ==> soma
* ` - ` ==> subtração
* ` * ` ==> multiplicação
* ` / ` ==> divisão
* ` % ` ==> módulo
### Atribuição
* ` += ` ==> n = n + i ==> n += i
* ` -= ` ==> n = n - i ==> n -= i
* ` *= ` ==> n = n * i ==> n *= i
* ` /= ` ==> n = n / i ==> n /= i
* ` %= ` ==> n = n % i ==> n %= i
### Relacionais (comparação somente entre tipos primitivos)
* ` > ` ==> maior que
* ` >= ` ==> maior ou igual
* ` < ` ==> menor que
* ` <= ` ==> menor ou igual
* ` == ` ==> igualdade
* ` != ` ==> desigualdade (diferença)
### Lógicos
* ` && ` ==> E (and)
* ` || ` ==> OU (or)
* ` ! ` ==> NÃO (not)
### Incremento
* ` ++ ` ==> soma um
### Decremento
* ` -- ` ==> subtrair um

## Pacotes
https://arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/28/1/tab1.png

* Toda classe que está no pacote ` java.lang ` são disponíveis por padrão.

## Classes
Estrutura padrão: 

    nome da classe.método desejado();

Exemplos:
* ` Integer.parseInt() `
* ` JOptionPane.showMessageDialog() `
### Classe JOptionPane
* ` showMessageDialog() ` ==> mostra uma janela com um texto na tela.
* ` showInputDialog() ` ==> mostra uma janela com uma caixa de entrada na tela.
* ` parseByte() ` ==> converte String para byte.
* ` parseShort() ` ==> converte String para short.
* ` parseInt() ` ==> converte String para int.
* ` parseLong() ` ==> converte String para long.
* ` parseFloat() ` ==> converte String para float.
* ` parseDouble() ` ==> converte String para double.
### Classe Scanner
* ` next() ` ==> lê uma palavra (lê tudo que vem antes de um espaço)
* ` nextLine() ` ==> lê uma frase (lê tudo que vem antes de um enter)
* ` nextInt() ` ==> lê uma STRING NUMÉRICA e converte para int
* ` nextDouble() ` ==> lê uma STRING NUMÉRICA e converte para double
### String
* String literal: "Bom dia", "Olá", "Doutor"...
* String numérica: "13", "5.4", "-20"...
* String alfanumérica: "Área 51", "abc&%", "jovem16"...
* Códigos especiais (usado apenas dentro de aspas "")
    * \n ==> pula uma linha
    * \t ==> faz tabulação (parágrafo)
#### Tipo Char
char ==> caractere (character)

Essa variável tem a função de guardar um caractere. Exemplo:

    char letra = 'S';

Tudo que for char, obrigatoriamente, é escrito entre apóstrofos (aspas simples).

` charAt(n) ` ==> retorna o caractere da posição específica. Exemplo:

    String nome = "maria";
    char letra = nome.charAt(2);

A resposta dessa linha de código será "r".

---
` equals() ` ==> faz a comparação de igualdade entre strings

    String nome = "maria";

    if (nome.equals("maria")){

    }

Usando o operador lógico ` ! ` (NÃO), o método ` equals() ` pode ser usado para comparação de diferença. Exemplo:

    String nome = "maria";
    char letra = nome.charAt(2);

    if (!nome.equals("maria")){

    }

## Estrutura de Decisão (desvio condicional)
* Toda estrutura de decisão precisa de um teste lógico, ou seja, uma comparação.

Uma estrutura de decisão nada mais é do que uma tomada de decisão. Sim ou não, abrir ou fechar, chorar ou rir, será uma escolha para uma determinada ação.

* Simples: Há apenas uma resposta. Se for verdadeiro, mostra resposta, senão, não há nenhum retorno.
* Composta: Há duas respostas. Verdadeiro ou falso, dependendo da decisão haverá uma resposta diferente.
* Aninhada (encadeada): Há várias respostas. Uma decisão pode desencadear várias outras estruturas.

* Bloco do ` if(){} ` ==> Todas as instruções que devem ser executadas caso o teste lógico seja verdadeiro.
* Bloco do ` else{} ` ==> Todas as intruções que devem ser executadas caso o teste lógico seja falso.

## Estrutura de Repetição (laços/loop)
As estruturas de repetição são usadas para realizar ações que se repetem de acordo com uma referência padrão como, por exemplo, uma taboada. Existem três tipos de estruturas de repetição em Java:

---
* ` for ` 

É mais adequado usar esse laço quando sabemos antecipadamente a quantidade de repetições.

Sintaxe padrão <strong>obrigatória</strong>:

    for (inicialização ; teste ; atualização) {
        
    }

* A inicialização determina onde se iniciará o laço.
* O teste determina o fim do laço.
* A atualização determina o passo do laço.

Exemplo: faça uma contagem que começa no número 1, termina no número 13 e, a cada passo, pule 3.

    for (int i=1 ; i<=13 ; i=i+3){
        System.out.println(i);
    }


---
* ` while `

É usado quando não sabemos previamente a quantidade de repetições.

Sintaxe padrão <strong>obrigatória</strong>:

    while (teste) {

    }

* O teste determina o fim do laço

Exemplo: faça uma contagem de 1 a 10.

    int i = 1;
    while (i <= 10){
        System.out.println(i);
        i++;
    }

---

## Métodos
* Função = Método

Alguns métodos que são muito usados por nós:
* main() ==> iniciar a execução
* print() ==> exibe na tela
* pow() ==> calcula a potência
* srqt() ==> calcula a raíz quadrada

Percebe-se que os métodos tem características particulares. Todo método executa uma única ação específica, são começados sempre por letra minúscula e acabam com parênteses.

Como criar seus próprios métodos?

    public static void main()


Para criar um método siga os seguintes passos, na exata sequência.

1º - modificador de acesso (visibilidade)
* public (público)
* private (privado)
* default (padrão)
* protected (protegido)
* static (estático) ==> visibilidade especial, não obrigatório

2º - tipo de retorno
* void (vazio) ==> não retorna nada
* int ==> retorna valores inteiros
* double ==> retorna valores decimais
* Objeto (classe)

3º - nome do método
* main()
* somar()
* area()

4º - argumento do método (o que está dentro dos parênteses)
* primeiro o tipo do argumento.
* depois o nome da variável que vai guardar o tipo do argumento.

Exemplo 1:

    class Calculadora{
        public static void main(String args[]){

        }
        public static double somar(double n1, double n2){
            double soma = n1 + n2;
            return soma;
        }
    }

Exemplo 2:

    class Calculadora{
        public static void main(String args[]){

        }
        public static double somar(double n1, double n2){
            double soma = n1 + n2;
            return (soma);
        }
    }

Exemplo 3:

    class Calculadora{
        public static void main(String args[]){

        }
        public static double somar(double n1, double n2){
            return(n1 + n2);
        }
    }

O método main é obrigado a existir em qualquer programa feito em Java, senão o mesmo não será capaz de se inicializar.

Para chamar um método é necessário seguir os seguintes passos:

    class Calculadora{
        public static void main(String args[]){
            double n1 = 10.0;
            double n2 = 5.5;
            double resultado = somar(n1, n2);
        }
        public static double somar(double n1, double n2){
            return(n1 + n2);
        }
    }

## Static
Métodos static só podem se comunicar com outros métodos static.

Enquanto uma variável for static ela existirá enquanto o programa estiver em execução, mas variáveis static só podem ser declaradas em métodos static.

    static double some = n1 + n2;

Em Java o main é <strong>obrigatoriamente</strong> static.

## Vetores
Exemplo:

    double nota1 = 0;
    double nota2 = 10;
    double nota3 = 7.5;
    ...
    double nota10 = 5.8;

Neste exemplo há a criação de várias linhas de código que tem a mesma função, guardar uma nota. Os vetores são capazes de fazer este trabalho sem essa repetição, vetores são capazes de guardar vários valores.

A criação de um vetor é semelhante a de uma variável e pode ser feito de duas maneiras:

    int[] n;

    ou

    int n[];

    ou

    double notas[] = new double[10];

Um vetor é um conjunto de variáveis então é necessário declarar quantos elementos vão se encontrar dentro dele:

    int n[] = {5, 3, 7};

De acordo com a quantidade de elementos no vetor você consegue atribuir o valor de acordo com a posição(índice) que o elemento se encontra na memória RAM. A contagem começa no 0.

    int n[] = {5, 3, 7};
    int num = n[2]

Neste exemplo a variável ` num ` vai receber o valor 7, que se encontra na 2ª posição do vetor.

Para atribuir um novo valor a uma posição faça:

    int n[] = {5, 3, 7};
    n[1] = 33;

Neste exemplo o valor 33 substituirá o valor 3 que se encontra na 1ª posição.

Para aumentar a quantidade de elementos ou o tanto de índices presentes no vetor faça:

    double temp[] = {8, 5, 7, 9, 6}
    double temp[] = new double[24]

Antes o vetor ` temp[] ` tinha apenas 5 índices, mas depois passou a ter 24.