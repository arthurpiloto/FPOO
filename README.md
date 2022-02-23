# Fpoo (Fundamentos de Programação Orientado a Objetos)

## Variáveis
* Variáveis não podem começar com números ou caracteres especiais, não podem ter acentos e espaços.
* Em Java, para declarar uma variável ou qualquer coisa que seja composta, é usado o formato Camel Case. Ex: TrocaDeVariavel.
### Numéricas (tipos primitivos)
* OBS: Todas as variáveis numéricas são primitivas, ou seja, foram criadas juntas com a linguagem Java. Cada tipo primitivo tem sua classe associada.
* Ordem de Precedência
    1º Parênteses
    2º Multiplicação e Divisão
    3º Soma e Subtração
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

### Conversão de sstring numérica em número
* Métodos parse
    * Classes associadas (wrapper)
    * Dentro de todas as classes associadas há métodos que podem ser usados, esses são exemplos
        * parseByte()
        * parseShort()
        * parseInt()
        * parseLong()
        * parseFloat()
        * parseDouble()

## Classes
* Estrutura padrão: "nome da classe"."método desejado"();
* Exemplos:
    * Integer.parseInt()
    * JOptionPane.showMessageDialog()