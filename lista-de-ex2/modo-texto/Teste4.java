import java.util.Scanner;
class Teste4{
    public static void main(String args[]){
        Scanner sc = new Scanner();

        System.out.print("\nInforme o valor da compra(R$): ");
        String valor = sc.nextDouble();
        System.out.print("\nInforme a porcentagem do desconto(%): ");
        String porcent = sc.next.Double();

        double desconto = (valor / 100) * porcent;
        double compra = valor - desconto;

        System.out.print("\nValor da compra: " + compra + "R$");
    }
}