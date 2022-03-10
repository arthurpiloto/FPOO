import javax.swing.JOptionPane;
class Simples{
    public static void main(String args[]){
        JOptionPane jp = new JOptionPane();

        int idade = Integer.parseInt(jp.showInputDialog(null, "Informe sua idade: "));

        if (idade > 17){
            jp.showMessageDialog(null, "Se aliste!");
        }
    }
}