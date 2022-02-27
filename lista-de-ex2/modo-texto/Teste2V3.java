import java.util.Scanner;
class Teste2V3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme um numero inteiro: ");
        int n1 = sc.nextInt();
        System.out.print("\nInforme outro numero inteiro: ");
        int n2 = sc.nextInt();

        int modulo = n1 % n2;

        System.out.print("\nModulo = " + modulo);
    }
}