// Elaborar um programa que exibe na tela o fatorial de um número.
// O exercício funciona apenas até o número 12, por conta do número ultrapassar o limite da variável int.

class Fatorial{
    public static void main(String args[]){
        int n = 12;
        int fat = n;

        for (int i=n-1; i>=2; --i){
            fat = fat * i;
        }
        System.out.print("\n" + n + "! = " + fat);
    }
}