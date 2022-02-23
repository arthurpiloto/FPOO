class Teste4{    
  public static void main(String args[]){
    double valor = 100;
    double porcent = 10;
    
    double desconto = (valor / 100) * porcent;
    double compra = valor - desconto;
    System.out.print("O valor total da sua compra é: " + compra);
  }
}