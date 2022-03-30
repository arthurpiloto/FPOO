// Otimização do exercício feito com o laço for.
// comando break = "quebra" laços.
// System.exit(0); = comando usado para encerrar um programa.

import java.util.Scanner;
class Fatorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nFATORIAL");
        System.out.print("\n----------------------------------");

        while(true){
            System.out.print("\nInforme um numero positivo (numeros entre 0 e 20): ");
            long n = sc.nextLong();
            if(n == 0){
                System.out.print("\n0! = 1");
                System.exit(0);
            }

            long fat = n;

            if(n >= 0 && n <= 20){
                for (long i=n-1; i>=2; --i){
                    fat *= i;
                }
                System.out.println("\n" + n + "! = " + fat);
                System.exit(0);
            }
            System.out.print("\nNumero Invalido!");
        }
    }
}