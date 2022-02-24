import javax.swing.JOptionPane;
class Teste4{
    public static void main(String args[]){
        JOptionPane jp = new JOptionPane();

        double valor = Double.parseDouble(jp.showInputDialog(null, "Informe o valor do produto: "));
        double porcent = Double.parseDouble(jp.showInputDialog(null, "Informe a porcentagem do desconto: "));

        double desconto = (valor / 100) * porcent;
        double compra = valor - desconto;

        jp.showMessageDialog(null, "Valor do desconto = " + desconto + "R$");
        jp.showMessageDialog(null, "Total a pagar = " + compra + "R$");
    }
}