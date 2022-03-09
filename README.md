# Fpoo (Fundamentos de Programação Orientado a Objetos)

## Variáveis
* Variáveis não podem começar com números ou caracteres especiais, não podem ter acentos e espaços.
* Em Java, para declarar uma variável ou qualquer coisa que seja composta, é usado o formato Camel Case. Ex: TrocaDeVariavel.
### Numéricas (tipos primitivos)
* OBS: Todas as variáveis numéricas são primitivas, ou seja, foram criadas juntas com a linguagem Java. Cada tipo primitivo tem sua classe associada.
* Ordem de Precedência
    * 1º Parênteses
    * 2º Multiplicação e Divisão
    * 3º Soma e Subtração
* Números inteiros
    * byte ==> Byte
    * short ==> Short
    * int (padrão de variáveis inteiras) ==> Integer
    * long ==> Long
* Números decimais
    * float ==> Float
    * double ==> Double
### String
* String literal: "Bom dia", "Olá", "Doutor"...
* String numérica: "13", "5.4", "-20"...
* String alfanumérica: "Área 51", "abc&%", "jovem16"...
* Códigos especiais (usado apenas dentro de aspas "")
    * \n ==> pula uma linha
    * \t ==> faz tabulação (parágrafo)
### Conversão de string numérica em número
* Métodos parse
    * Classes associadas (wrapper)
    * Dentro de todas as classes associadas há métodos que podem ser usados, esses são exemplos
        * parseByte()
        * parseShort()
        * parseInt()
        * parseLong()
        * parseFloat()
        * parseDouble()

## Pacotes
https://arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/28/1/tab1.png

## Classes
* Estrutura padrão: "nome da classe"."método desejado"();
* Exemplos:
    * Integer.parseInt()
    * JOptionPane.showMessageDialog()
### Classe JOptionPane
* showMessageDialog() ==> mostra uma janela com um texto na tela
* showInputDialog() ==> mostra uma janela com uma caixa de entrada na tela
### Classe Scanner
* next() ==> lê uma palavra (lê tudo que vem antes de um espaço)
* nextLine() ==> lê uma frase (lê tudo que vem antes de um enter)
* nextInt() ==> lê uma STRING NUMÉRICA e converte para int
* nextDouble() ==> lê uma STRING NUMÉRICA e converte para double

## Estrutura de Decisão (desvio condicional)
* Toda estrutura de decisão precisa de um teste lógico, ou seja, uma comparação.

Uma estrutura de decisão nada mais é do que uma tomada de decisão. Sim ou não, abrir ou fechar, chorar ou rir, será uma escolha para uma determinada ação.
* Simples: Há apenas uma resposta. Se for verdadeiro, mostra resposta, senão, não há nenhum retorno.
* Composta: Há duas respostas. Verdadeiro ou falso, dependendo da decisão haverá uma resposta diferente.
* Aninhada (encadeada): Há várias respostas. Uma decisão pode desencadear várias outras estruturas.

## Operadores
### Aritméticos (matemáticos)
* "+"
* "-"
* "*"
* "/"
* "%"

### Relacionais (comparação)
* ">" maior que
* ">=" maior ou igual
* "<" menor que
* "<=" menor ou igual