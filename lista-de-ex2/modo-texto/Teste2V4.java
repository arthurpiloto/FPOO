import java.util.Scanner;
class Teste2V4{
    public static void main(String args[]){
        Scanner sc = new Scanner();

        System.out.print("\nInforme um numero inteiro: ");
        String n1 = sc.nextInt();
        System.out.print("\nInforme outro numero inteiro: ");
        String n2 = sc.nextInt();

        double raiz1 = Math.sqrt(n1);
        double raiz2 = Math.sqrt(n2);

        System.out.print("Raiz quadrada de " + n1 + " = " + raiz1);
        System.out.print("Raiz quadrada de " + n2 + " = " + raiz2);
    }
}