import java.util.Scanner;
class Teste6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme os graus em Celsius: ");
        double graus = sc.nextDouble();

        double f = (graus * 9 / 5) + 32;

        System.out.print(graus + "° Celsius = " + f + "° Fahrenheit");
    }
}