import javax.swing.JOptionPane;
class Aninhada{
    public static void main(String args[]){
        JOptionPane jp = new JOptionPane();

        int idade = Integer.parseInt(jp.showInputDialog(null, "Informe sua idade: "));

        // if ((idade >= 1) && (idade <= 120)){
        //     jp.showMessageDialog(null, "Idade Válida!");
        // } else if (idade > 17){
        //     jp.showMessageDialog(null, "Se aliste!");
        // } else {
        //     jp.showMessageDialog(null, "Idade Inválida!");
        // }

        // if (idade >= 1){
        //     jp.showMessageDialog(null, "Se aliste!");
        // } else if (idade <= 120){
        //     jp.showMessageDialog(null, "Se aliste!");
        // } else if (idade > 120){
        //     jp.showMessageDialog(null, "Idade Inválida!");
        // } else if (idade < 1){
        //     jp.showMessageDialog(null, "Idade Inválida!");
        // } else{
        //     jp.showMessageDialog(null, "Insira a idade novamente!");
        // }
    }
}