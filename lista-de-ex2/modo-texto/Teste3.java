import java.util.Scanner;
class Teste3{
    public static void main(String args[]){
        Scanner sc = new Scanner();

        System.out.print("\nDigite um numero inteiro: ");
        String variavel1 = sc.nextInt();
        System.out.print("\nDigite outro numero inteiro: ");
        String variavel2 = sc.nextInt();

        System.out.println("Primeiro numero: " + variavel1);
        System.out.print("Segundo numero: " + variavel2);

        int local = variavel1;
        variavel1 = variavel2;
        variavel2 = local1;

        System.out.println("Primeiro numero: " + variavel1);
        System.out.print("Segundo numero: " + variavel2);
    }
}