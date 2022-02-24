import javax.swing.JOptionPane;
class Teste3{
    public static void main(String args[]){
        JOptionPane jp = new JOptionPane();

        int variavel1 = Integer.parseInt(jp.showInputDialog(null, "Informe o valor da variavel 1: "));
        int variavel2 = Integer.parseInt(jp.showInputDialog(null, "Informe o valor da variavel 2: "));
        jp.showMessageDialog(null, "Variavel 1 = " + variavel1);
        jp.showMessageDialog(null, "Variavel 2 = " + variavel2);

        int local = variavel1;
        variavel1 = variavel2;
        variavel2 = local1;

        jp.showMessageDialog(null, "Variavel 1 = " + variavel1);
        jp.showMessageDialog(null, "Variavel 2 = " + variavel2);
    }
}