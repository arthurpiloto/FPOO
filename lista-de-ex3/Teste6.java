import java.util.Scanner;
class Teste6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme sua idade: ");
        int idade = sc.nextInt();

        if(idade > 0 && idade <= 150) {
            if(idade >= 18) {
                System.out.print("\nMaior de idade");
            }else {
                System.out.print("\nMenor de idade");
            }
        }else {
            System.out.print("\nIdade invalida");
        }
    }
}