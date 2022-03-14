import java.util.Scanner;
class Teste3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme um numero: ");
        double n1 = sc.nextDouble();
        System.out.print("\nInforme outro numero: ");
        double n2 = sc.nextDouble();

        if(n1 > n2 || n2 > n1){
            if(n1 > n2){
                System.out.print("\nO primeiro e o maior");
            }else {
                System.out.print("\nO segundo e o maior");
            }
        }else {
            System.out.print("\nOs dois sao guais");
        }
    }
}