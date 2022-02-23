import java.util.Scanner;

class EntradaTexto{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("\nSeu nome e: " + nome);
    }
}