import java.util.Scanner;
class Vetor{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        double vetor[] = new double[5];

        // Entrada de dados
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Insira o " + (i+1) + " numero decimal: ");
            vetor[i] = ler.nextDouble();
        }

        // Média Aritmética
        double somaNum = 0;
        for(int i = 0; i < veotr.length; i++){
            somaNum += vetor[i];
        }
        double media = somaNum / vetor.length;
        System.out.println("\nMedia = " + media);

        // Maior número
        

        // Saída de dados
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Numero " + (i+1) + ": " + vetor[i]);
        }
    }
}