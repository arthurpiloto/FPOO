import java.util.Scanner;
class Teste1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme um numero inteiro: ");
        int n1 = sc.nextInt();

        if(n1 > 0 || n1 < 0) {
            if(n1 > 0) {
                System.out.print("\nNumero positivo");
            }else {
                System.out.print("\nNumero negativo");
            }
        }else {
            System.out.print("\nIgual a zero");
        }
    }
}