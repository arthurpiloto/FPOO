import java.util.Scanner;
class Notas{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        double notas[] = new double[5];

        for(int i = 0; i < notas.length; i++){
            System.out.println((i+1) + "ª nota: ");
            notas[i] = ler.nextDouble();
        }

        System.out.println();
        double somaNotas = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.println((i+1) + "ª nota: " + notas[i]);
            somaNotas += notas[i];
        }

        double media = somaNotas / notas.length;

        if(media < 7){
            System.out.println();
            System.out.println("Sua média é igual a: " + media + ". Reprovado!");

        }
        else{
            System.out.println();
            System.out.println("Sua média é igual a: " + media + ". Aprovado!");
        }
    }
}