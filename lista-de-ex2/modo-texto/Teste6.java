import java.util.Scanner;
class Teste5{
    public static void main(String args[]){
        Scanner sc = new Scanner();

        System.out.print("\nInforme os graus em Fahrenheit: ");
        String graus = sc.nextDouble();

        double f = graus * 9 /  + 160;

        System.out.print(graus + "° Celsius = " + f + "° Fahrenheit");
    }
}