// javax.swing - pacote de classes gráficas
import javax.swing.JOptionPane;

class EntradaGrafica{
    public static void main(String args[]){
        // sempre crie um objeto da classe (instância da classe)
        JOptionPane jp = new JOptionPane();

        // Converte string numérica em número inteiro
        int anoNasc = Integer.parseInt(jp.showInputDialog(null, "Informe seu ano de nascimento: "));
        jp.showMessageDialog(null, "Você nasceu em " + anoNasc);
    }
}