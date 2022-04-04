import java.util.Scanner;
class ParImpar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            while(true){
                System.out.print("\nInforme um numero inteiro: ");
                int n1 = sc.nextInt();
        
                if(n1 % 2 == 0){
                    System.out.print("\nPar");
                    break;
                }
                else{
                    System.out.print("\nImpar");
                    break;
                }
            }
            
            System.out.print("\nDeseja continuar? [s/n]: ");
            char option = sc.next().charAt(0);

            if(option != 's'){
                System.exit(0);
            }
        }
    }
}