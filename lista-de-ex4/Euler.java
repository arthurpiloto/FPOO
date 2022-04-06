import java.util.Scanner;
class Euler{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme um numero positivo: ");
        double n = sc.nextDouble();

        double euler = Math.pow((1 + 1 / n), n);

        System.out.print("\ne = " + euler);
    }
}