class IdadeSeg{
  public static void main(String args[]){
    int idade = 16;
    
    int idade_dias = idade * 365;
    int idade_horas = idade_dias * 24;
    int idade_min = idade_horas * 60;
    int idade_seg = idade_min * 60;
    System.out.print("Sua idade em segundos é: " + idade_seg + " segundos");
  }
}