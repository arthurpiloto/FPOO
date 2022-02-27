import java.util.Scanner;
class Teste5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme o valor a ser convertido: ");
        double valorDolar = sc.nextDouble();
        System.out.print("\nInforme a cotacao do dolar atualmente: ");
        double cotacaoDolar = sc.nextDouble();

        double real = valorDolar * cotacaoDolar;

        System.out.print("US$" + valorDolar + " = R$" + real);
    }
}