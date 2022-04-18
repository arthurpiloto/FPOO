import java.util.Scanner;
class GeometriaArea{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double base = 0;
        double altura = 0;
        double raio = 0;
        double pi = 0;

        while(true){
            System.out.print("Qual area deseja calcular?[quadrado/retangulo/circulo/triangulo]: ");
            String calculo = sc.next();

            if(calculo.equals("quadrado") || calculo.equals("Quadrado")){
                System.out.print("\nInsira a base(b): ");
                base = sc.nextDouble();
                System.out.print("Insira a altura(h): ");
                altura = sc.nextDouble();

                if(base == altura){
                    System.out.println("A area do quadrado eh igual a " + areaQuadrado(base, altura));
                }
                else{
                    System.out.println("os valores nao correspondem a um quadrado! Repita.");
                }
            } 
            else if(calculo.equals("retangulo") || calculo.equals("Retangulo")){
                System.out.println("A area do retangulo eh igual a " + areaRetangulo(base, altura));
            }
            else if(calculo.equals("circulo") || calculo.equals("Circulo")){
                System.out.println("A area do circulo eh igual a " + areaCirculo(raio, pi));
            }
            else if(calculo.equals("triangulo") || calculo.equals("Triangulo")){
                System.out.println("A area do triangulo eh igual a " + areaTriangulo(base, altura));
            }
            

            System.out.print("\nDeseja continuar[s/n]: ");
            char option = sc.next().charAt(0);
            if(option != 's'){
                System.exit(0);
            }
        }
    }

    public static double areaQuadrado(double base, double altura){
        return(base * altura);
    }

    public static double areaRetangulo(double base, double altura){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInsira a base(b): ");
        base = sc.nextDouble();
        System.out.print("Insira a altura(h): ");
        altura = sc.nextDouble();

        return(base * altura);
    }

    public static double areaCirculo(double raio, double pi){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInsira o raio(r): ");
        raio = sc.nextDouble();
        System.out.print("Insira o valor de pi (π): ");
        pi = sc.nextDouble();

        return(pi * raio * raio);
    }

    public static double areaTriangulo(double base, double altura){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInsira a base(b): ");
        base = sc.nextDouble();
        System.out.print("Insira a altura(h): ");
        altura = sc.nextDouble();

        return((base * altura) / 2);
    }
    
}