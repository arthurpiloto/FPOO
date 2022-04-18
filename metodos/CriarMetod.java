import java.util.Scanner;
class CriarMetod{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("\nInsira um numero decimal: ");
            double n1 = sc.nextDouble();
            System.out.print("\nInsira outro numero decimal: ");
            double n2 = sc.nextDouble();

            double soma = somar(n1, n2);
            double sub = subtrair(n1, n2);
            double divi = dividir(n1, n2);
            double multip = multiplicar(n1, n2);

            System.out.println("\n------Soma------");
            System.out.println(n1 + " + " + n2 + " = " + soma);
            System.out.println("----------------");
            
            System.out.println("\n------Subtracao------");
            System.out.println(n1 + " - " + n2 + " = " + sub);
            System.out.println("---------------------");

            System.out.println("\n------Multiplicacao------");
            System.out.println(n1 + " * " + n2 + " = " + multip);
            System.out.println("-------------------------");

            if(n1 == 0 || n2 == 0){
                System.out.println("\n------Divisao------");
                System.out.println(n1 + " / " + n2 + " = resultado indefinido");
                System.out.println("-------------------");
            }
            else{
            System.out.println("\n------Divisao------");
            System.out.println(n1 + " / " + n2 + " = " + divi);
            System.out.println("-------------------");
            }
            
            System.out.print("\nDeseja continuar[s/n]: ");
            char option = sc.next().charAt(0);
            if(option != 's'){
                System.exit(0);
            }
        }
    }

    public static double somar(double n1, double n2){
        return(n1 + n2);
    }

    public static double subtrair(double n1, double n2){
        return(n1 - n2);
    }

    public static double dividir(double n1, double n2){
        return(n1 / n2);
    }

    public static double multiplicar(double n1, double n2){
        return(n1 * n2);
    }
}