import java.util.Scanner;
class Fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nQntd. de valores para Fibonacci: ");
        int qtd = sc.nextInt();
        if(qtd < 2){
            System.out.print("\n1");
            System.exit(0);
        }
        long n1 = 1;
        long n2 = 1;
        System.out.print("\n1, 1");
        
        for(int i = 0; i<qtd-2; i++){
            long n3 = n1 + n2;
            System.out.print(", " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}