import java.util.Scanner;
class Teste3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite um numero inteiro: ");
        int variavel1 = sc.nextInt();
        System.out.print("\nDigite outro numero inteiro: ");
        int variavel2 = sc.nextInt();

        System.out.println("Primeiro numero: " + variavel1);
        System.out.println("Segundo numero: " + variavel2);

        int local = variavel1;
        variavel1 = variavel2;
        variavel2 = local;

        System.out.println("Primeiro numero: " + variavel1);
        System.out.print("Segundo numero: " + variavel2);
    }
}