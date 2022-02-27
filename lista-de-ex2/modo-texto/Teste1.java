import java.util.Scanner;
class Teste1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite um numero: ");
        int n1 = sc.nextInt();
        System.out.print("\nDigite outro numero: ");
        int n2 = sc.nextInt();

        double soma = n1 + n2;
        double sub = n1 - n2;
        double multip = n1 * n2;
        double divi = n1 / n2;

        System.out.println("\nSoma = " + soma);
        System.out.println("\nSubtracao = " + sub);
        System.out.println("\nMultiplicacao = " + multip);
        System.out.print("\nDivisao = " + divi);
    }
}