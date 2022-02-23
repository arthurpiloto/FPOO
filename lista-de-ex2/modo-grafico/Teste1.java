import javax.swing.JOptionPane;
class Teste1{
    public static void main(String args[]){
        JOptionPane jp = new JOptionPane();

        double n1 = Double.parseDouble(jp.showInputDialog(null, "Informe o primeiro numero: "));
        double n2 = Double.parseDouble(jp.showInputDialog(null, "Informe o segundo numero: "));

        double soma = n1 + n2;
        double sub = n1 - n2;
        double multip = n1 * n2;
        double divi = n1 / n2;

        jp.showMessageDialog(null, "\nSoma = " + soma);
        jp.showMessageDialog(null, "\nSubtracao = " + sub);
        jp.showMessageDialog(null, "\nMultiplicacao = " + multip);
        jp.showMessageDialog(null, "\nDivisao = " + divi);
    }
}