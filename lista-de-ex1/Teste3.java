class Teste3{
  public static void main(String args[]){
    int variavel1 = 10;
    int variavel2 = 4;

    System.out.println("Primeira variável = " + variavel1);
    System.out.println("Segunda variável = " + variavel2);
    
    int local1 = variavel1;
    variavel1 = variavel2;
    variavel2 = local1;
    
    System.out.println("Primeira variável = " + variavel1);
    System.out.print("Segunda variável = " + variavel2);
  }
}