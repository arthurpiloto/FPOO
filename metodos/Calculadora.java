import java.util.Scanner;
class Calculadora{
    public static void main(String args[]){
        // Chamada ao método entradaDados
        double n1 = entradaDados();
        double n2 = entradaDados();

        // Chamada ao método somar
        double soma = somar(n1, n2);

        // Chamada ao método subtrair
        double diferenca = subtrair(n1, n2);

        // Chamada ao método multiplicar
        double produto = multiplicar(n1, n2);

        // Chamada ao método dividir
        double quociente = dividir(n1, n2);

        // Chamada ao método saidaDados
        saidaDados(n1, '+', n2, soma);
        saidaDados(n1, '-', n2, diferenca);
        saidaDados(n1, '*', n2, produto);
        saidaDados(n1, '/', n2, quociente);
    }

    // Método entrada de dados
    public static double entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        double num = sc.nextDouble();
        return num;
    }

    // Método somar
    public static double somar(double n1, double n2){
        return n1 + n2;
    }

    // Método subtrair
    public static double subtrair(double n1, double n2){
        return n1 - n2;
    }

    // Método multiplicar
    public static double multiplicar(double n1, double n2){
        return n1 * n2;
    }

    // Método dividir
    public static double dividir(double n1, double n2){
        if(n2 == 0){
            return -1;
        }
        return n1 / n2;
    }

    // Método saída de dados
    public static void saidaDados(double n1, char op, double n2, double res){
        System.out.print("\n" + n1 + " " + op + " " + n2 + " = " + res);
    }
}