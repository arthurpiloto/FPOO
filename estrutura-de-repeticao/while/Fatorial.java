// Otimização do exercício feito com o laço for.

import java.util.Scanner;
class Fatorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nFATORIAL");
        System.out.print("\n----------------------------------");
        while(true){
            System.out.print("\nInforme um numero positivo (numeros entre 0 e 20): ");
            long n = sc.nextLong();
            long fat = n;
            if(n >= 0 && n <= 20){
                if(n == 0){
                    System.out.print("\n" + n + "! = 1");
                }
                else{
                    for (long i=n-1; i>=2; --i){
                        fat *= i;
                    }
                    System.out.print("\n" + n + "! = " + fat);
                }

                // comando break = "quebra" laços.
                // System.exit(0); = comando usado para encerrar um programa.
                System.exit(0);
            }

            System.out.println("\nNumero invalido!");
        }
    }
}