import java.util.Scanner;
class Teste4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme um numero inteiro: ");
        int n1 = sc.nextInt();

        if(n1 % 2 == 0){
            System.out.print("\nPar");
        }
        else{
            System.out.print("\nImpar");
        }
    }
}