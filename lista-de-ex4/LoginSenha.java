import java.util.Scanner;
class LoginSenha{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String login = "Arthur";
        String senha = "Senai127";
        int rep = 1;
        
        while(rep <= 3){
            for(int i = 1; i <= 3; i++){
                System.out.print("\nLogin: ");
                String loginTl = sc.next();
                if(!loginTl.equals("Arthur")){
                    System.out.print("\nLogin incorreto, repita o processo.");
                    rep++;
                    break;
                }
            
                System.out.print("Senha: ");
                String senhaTl = sc.next();
                if(!senhaTl.equals("Senai127")){
                    System.out.print("\nSenha incorreta, repita o processo.");
                    rep++;
                    break;
                } else{
                    System.out.print("\nBem-vindo!");
                    System.exit(0);
                }
            }
        }
    }
}