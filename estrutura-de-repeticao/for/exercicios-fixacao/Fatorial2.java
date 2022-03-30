// Exercício otimizado em relação ao anterior.

import java.util.Scanner;
class Fatorial2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nFATORIAL");
        System.out.print("\n---------------------");
        System.out.print("\nInforme um valor: ");
        long n = sc.nextLong();
        long fat = n;
        if (n < 25){
            for (long i=n-1; i>=2; --i){
                fat *= i;
            }
            System.out.print("\n" + n + "! = " + fat);
        } else{
            System.out.print("\nNumero invalido!");
        }
    }
}