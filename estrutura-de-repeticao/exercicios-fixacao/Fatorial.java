// Elaborar um programa que exibe na tela o fatorial de um número.

class Fatorial{
    public static void main(String args[]){
        int n = 15;
        for (int i=n; i<=1; i--){
            System.out.print("\n" + n + "! = " + n*i);
        }
    }
}