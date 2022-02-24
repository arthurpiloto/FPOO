import javax.swing.JOptionPane;
class Teste2V2{
    public static void main(String args[]){
        JOptionPane jp = new JOptionPane();

        int n1 = Integer.parseInt(jp.showInputDialog(null, "Informe um numero inteiro: "));
        int n2 = Integer.parseInt(jp.showInputDialog(null, "Informe outro numero inteiro: "));

        double divi = n1 / n2;

        jp.showMessageDialog(null, n1 + " / " + n2 + " = " + divi);
    }
}