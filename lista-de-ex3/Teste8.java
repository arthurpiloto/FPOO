import java.util.Scanner;
class Teste8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Informe sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("\nIMC = %.2f", imc);

        if(imc < 17){
            System.out.print("\nMuito abaixo do peso");
        }
        if(imc >= 17 && imc < 18.5){
            System.out.print("\nAbaixo do peso");
        }
        if(imc >= 18.5 && imc < 25){
            System.out.print("\nPeso normal");
        }
        if(imc >= 25 && imc < 30){
            System.out.print("\nAcima do peso");
        }
        if(imc >= 30 && imc < 35){
            System.out.print("\nObesidade I");
        }
        if(imc >= 35 && imc < 40){
            System.out.print("\nObesidade II (severa)");
        }
        if(imc >= 40){
            System.out.print("\nObesidade III (morbida)");
        }
    }
}
