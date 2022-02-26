import java.util.Scanner;
class Teste5{
    public static void main(String args[]){
        Scanner sc = new Scanner();

        System.out.print("\nInforme o valor a ser convertido: ");
        String valorDolar = sc.nextDouble();
        System.out.print("\nnforme a cotacao do dolar atualmente: ")
        String cotacaoDolar = sc.nextDouble();

        double real = valorDolar * cotacaoDolar;

        System.out.print("US$" + valorDolar + " = R$" + real);
    }
}