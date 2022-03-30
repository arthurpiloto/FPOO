# Fpoo (Fundamentos de Programação Orientado a Objetos)
* https://replit.com/ ==> plataforma de programação em navegadores.
* Clean code ==> código limpo, técnica levada ao pé da letra em Java.

## Variáveis
* Variáveis não podem começar com números ou caracteres especiais, não podem ter acentos e espaços.
* Em Java, para declarar uma variável ou qualquer coisa que seja composta, é usado o formato Camel Case. Ex: TrocaDeVariavel.

Variável é um espaço reservado (alocado) dentro da memória RAM para gravar uma informação de um tipo preestabelecido. Há vários tipos de variáveis em Java:
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
### String
* String literal: "Bom dia", "Olá", "Doutor"...
* String numérica: "13", "5.4", "-20"...
* String alfanumérica: "Área 51", "abc&%", "jovem16"...
* Códigos especiais (usado apenas dentro de aspas "")
    * \n ==> pula uma linha
    * \t ==> faz tabulação (parágrafo)

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
### Relacionais (comparação)
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

* Toda classe que está no pacote ``` java.lang ``` são disponíveis por padrão.

## Classes
Estrutura padrão: 

    nome da classe.método desejado();

* Exemplos:
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

Exemplo: faça uma contagem que começa no número 1, termina no número 13 e, a cada passo, pele 3.

    for (int i=1 ; i<=13 ; i=i+3){
        System.out.println(i);
    }


---
* ` while `

É usado quando não sabemos previamente a quantidade de repetições.

---
* ` do while `