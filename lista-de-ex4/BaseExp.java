import java.util.Scanner;
class BaseExp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long base = 0;
        long exp = 0;

        while(true){
            System.out.print("Base: ");
            base = sc.nextLong();
            System.out.print("Expoente: ");
            exp = sc.nextLong();
            if(base >= 0 && exp >= 0){
                break;
            }
        }
        
        long contador = base;
        for(long i = exp-1; i >= 1; i--){
            contador *= base;
        }
        System.out.print(base + "^" + exp + " = " + contador);
    }
}