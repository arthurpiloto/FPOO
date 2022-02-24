import javax.swing.JOptionPane;
class Teste5{
    public static void main(String args[]){
        JOptionPane jp = new JOptionPane();

        double valorDolar = Double.parseDouble(jp.showInputDialog(null, "Informe o valor a ser convertido: "));
        double cotacaoDolar = Double.parseDouble(jp.showInputDialog(null, "Informe a cotacao do dolar atualmente: "));

        double real = valorDolar * cotacaoDolar;

        jp.showMessageDialog(null, "US$" + valorDolar + " = R$" + real);
    }
}