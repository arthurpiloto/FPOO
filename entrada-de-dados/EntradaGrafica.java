// javax.swing - pacote de classes gráficas
import javax.swing.JOptionPane;

class EntradaGrafica{
    public static void main(String args[]){
        // sempre crie um objeto da classe (instância da classe)
        JOptionPane jp = new JOptionPane();

        int anoNasc = jp.showInputDialog(null, "Informe seu ano de nascimento:");
    }
}