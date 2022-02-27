import java.util.Scanner;
class Teste2V4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme um numero inteiro: ");
        int n1 = sc.nextInt();
        System.out.print("\nInforme outro numero inteiro: ");
        int n2 = sc.nextInt();

        double raiz1 = Math.sqrt(n1);
        double raiz2 = Math.sqrt(n2);

        System.out.println("Raiz quadrada de " + n1 + " = " + raiz1);
        System.out.print("Raiz quadrada de " + n2 + " = " + raiz2);
    }
}