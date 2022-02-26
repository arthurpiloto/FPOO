import java.util.Scanner;
class Teste2V2{
    public static void main(String args[]){
        Scanner sc = new Scanner();

        System.out.print("\nInforme um numero: ");
        String n1 = sc.nextInt();
        System.out.print("\nnforme outro numero inteiro: ");
        String n2 = sc.nextInt();

        double divi = n1 / n2;

        System.out.print(n1 + "/" + n2 + " = " + divi);
    }
}