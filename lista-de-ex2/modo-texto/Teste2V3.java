import java.util.Scanner;
class Teste2V3{
    public static void main(String args[]){
        Scanner sc = new Scanner();

        System.out.print("\nInforme um numero inteiro: ");
        String n1 = sc.nextInt();
        System.out.print("\nInforme outro numero inteiro: ");
        String n2 = sc.nextInt();

        int modulo = n1 % n2;

        System.out.print("\nModulo = " + modulo);
    }
}