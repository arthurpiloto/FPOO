import javax.swing.JOptionPane;
class Teste2V4{
    public static void main(String args[]){
        JOptionPane jp = new JOptionPane();

        int n1 = Integer.parseInt(jp.showInputDialog(null, "Informe um numero inteiro: "));
        int n2 = Integer.parseInt(jp.showInputDialog(null, "Informe outro numero inteiro: "));

        double raiz1 = Math.sqrt(n1);
        double raiz2 = Math.sqrt(n2);

        jp.showMessageDialog(null, "Raiz quadrada de " + n1 + " = " + raiz1);
        jp.showMessageDialog(null, "Raiz quadrada de " + n2 + " = " + raiz2);
    }
}