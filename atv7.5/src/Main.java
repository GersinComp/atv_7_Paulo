import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Exemplo de uso da classe
        NumeroInteiro num1 = new NumeroInteiro();
        JOptionPane.showMessageDialog(null, "Valor ao instanciar a classe: " + num1.getNumero());

        int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro valor:"));
        NumeroInteiro num2 = new NumeroInteiro(primeiroValor);
        JOptionPane.showMessageDialog(null, "Número inicial: " + num2.getNumero());

        int numSoma = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número que deseja somar:"));
        num1.soma(numSoma);
        JOptionPane.showMessageDialog(null, "Após soma: " + num1.getNumero());

        int numSubt = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor que deseja subtrair:"));
        num2.subtrai(numSubt);
        JOptionPane.showMessageDialog(null, "após subtrair: " + num2.getNumero());

        JOptionPane.showMessageDialog(null, "É primo? " + num1.numPrimo(num1.getNumero()));
        JOptionPane.showMessageDialog(null, "É primo? " + num2.numPrimo(num2.getNumero()));

        JOptionPane.showMessageDialog(null, "Próximo primo após " + num1.getNumero() + ": " + num2.numPrimo(num1.getNumero()));
        JOptionPane.showMessageDialog(null, "Próximo primo após " + num1.getNumero() + ": " + num2.numPrimo(num2.getNumero()));

    }
}
