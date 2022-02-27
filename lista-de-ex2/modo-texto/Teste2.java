import java.util.Scanner;
class Teste2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite um numero inteiro: ");
        int n1 = sc.nextInt();
        System.out.print("\nDigite outro numero inteiro: ");
        int n2 = sc.nextInt();

        double pot1 = Math.pow(n1, 5);
        double pot2 = Math.pow(n2, 5);

        System.out.println(n1 + "^5 = " + pot1);
        System.out.print(n2 + "^5 = " + pot2);
    }
}