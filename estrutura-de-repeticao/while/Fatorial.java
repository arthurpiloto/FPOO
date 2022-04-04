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
            while(true){
                System.out.print("\nInforme um numero positivo: ");
                long n = sc.nextLong();
                if(n == 0){
                    System.out.print("\n0! = 1");
                    break;
                }
    
                long fat = n;
    
                if(n >= 0){
                    for (long i=n-1; i>=2; --i){
                        fat *= i;
                    }
                    System.out.println("\n" + n + "! = " + fat);
                    break;
                }
                System.out.print("\nNumero Invalido!");
            }

            // Código adicionado
            System.out.print("\nDeseja continuar? [s/n]: ");
            char option = sc.next().charAt(0);

            if(option != 's'){
                System.exit(0);
            }
        }
    }
}