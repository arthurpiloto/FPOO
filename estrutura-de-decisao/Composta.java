import javax.swing.JOptionPane;
class Composta{
    public static void main(String args[]){
        JOptionPane jp = new JOptionPane();

        int idade = Integer.parseInt(jp.showInputDialog(null, "Informe sua idade: "));

        if (idade > 17){
            jp.showMessageDialog(null, "Maior de idade!");
        } else{
            jp.showMessageDialog(null, "Menor de idade!");
        }
    }
}