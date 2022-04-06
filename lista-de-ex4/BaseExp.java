import java.util.Scanner;
class BaseExp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        long base = sc.nextLong();
        System.out.print("Expoente: ");
        long exp = sc.nextLong();
        long contador = base;

        for(long i = exp-1; i >= 1; i--){
            contador *= base;
        }
        System.out.print("\n= " + contador);
    }
}   