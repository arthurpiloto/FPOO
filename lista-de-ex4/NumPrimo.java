import java.util.Scanner;
class NumPrimo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite um numero inteiro >= 2: ");
        int n = sc.nextInt();

        for(int i = 2; i<n/2+1; i++){
            if(n % i == 0){
                System.out.print("\n" + n + " nao eh primo");
                System.exit(0);
            }
        }
        System.out.print("\n" + n + " eh primo");
    }
}