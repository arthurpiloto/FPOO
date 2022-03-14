import javax.swing.JOptionPane;
class Aninhada{
    public static void main(String args[]){
        JOptionPane jp = new JOptionPane();

        int idade = Integer.parseInt(jp.showInputDialog(null, "Informe sua idade: "));

        if(idade >= 1 && idade <= 120) {
            if(idade >= 18) {
                jp.showMessageDialog(null, "Maior de idade!");
            }else {
                jp.showMessageDialog(null, "Menor de idade!");
            }
        }else {
            jp.showMessageDialog(null, "Idade invalida!");
        }
    }
}