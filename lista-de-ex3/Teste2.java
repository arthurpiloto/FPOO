import java.util.Scanner;
class Teste2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme um numero: ");
        double n1 = sc.nextDouble();

        if(n1 > 10 || n1 < 10){
            if(n1 > 10){
                System.out.print("\nMaior que dez");
            }else {
                System.out.print("\nMenor que dez");
            }
        }else {
            System.out.print("\nIgual a dez");
        }
    }
}