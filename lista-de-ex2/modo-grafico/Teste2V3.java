import javax.swing.JOptionPane;
class Teste2V3{
    public static void main(String args[]){
        JOptionPane jp = new JOptionPane();

        int n1 = Integer.parseInt(jp.showInputDialog(null, "Informe um numero inteiro: "));
        int n2 = Integer.parseInt(jp.showInputDialog(null, "Informe outro numero inteiro: "));

        int modulo = n1 % n2;

        jp.showMessageDialog(null, "Modulo de " + n1 + " / " + n2 + " = " + modulo);
    }
}