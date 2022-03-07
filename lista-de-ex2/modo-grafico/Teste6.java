import javax.swing.JOptionPane;
class Teste6{
    public static void main(String args[]){
        JOptionPane jp = new JOptionPane();

        double graus = Double.parseDouble(jp.showInputDialog(null, "Informe os graus em Celsius: "));

        double f = (graus * 9 / 5) + 32;

        jp.showMessageDialog(null, graus + "° Celsius = " + f + "° Fahrenheit");
    }
}